package _2_StreamDeDados;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.Loader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.regex.*;

public class _3_LendoDados {
    public static void main(String[] args) {
        try {
            //caminho da pasta do escritório
            Path p1 = Path.of("\\\\desktop-m81u9sg\\Contabiehl\\Departamento Pessoal\\RESUMOS MENSAIS\\");
            String currentMonth = YearMonth.now().minusMonths(1).format(DateTimeFormatter.ofPattern("MM-yyyy"));
            Path p2 = Files.createDirectories(p1.resolve(Path.of(currentMonth)));
            Path fileToRead = p1.resolve(Path.of("ResumoMensal-"+YearMonth.now().minusMonths(1).format(DateTimeFormatter.ofPattern("MMyyyy"))+".pdf"));

            //verifica se o arqv da competência atual já foi gerado
            if (Files.exists(fileToRead)){
                File file = new File(fileToRead.toString());
                PDDocument document = Loader.loadPDF(file);
                PDFTextStripper stripper = new PDFTextStripper();
                String texto = stripper.getText(document);
                document.close();

                // Regex para blocos por empresa
                Pattern blocoEmpresa = Pattern.compile(
                        "Empresa:\\s+(\\d+\\s*-\\s*[A-ZÂÊÔÁÍÓÚÃÕÇÉ\\.\\-\\s]+)(.*?)(?=Empresa:|\\Z)",
                        Pattern.DOTALL | Pattern.CASE_INSENSITIVE
                );

                // Regex para FGTS e INSS dentro do bloco da empresa
                Pattern fgtsPattern = Pattern.compile("F\\.G\\.T\\.S\\s+DO MES.*?(\\d{1,3},\\d{2})\\s+\\*", Pattern.DOTALL);
                Pattern inss998Pattern = Pattern.compile("I\\.N\\.S\\.S\\.998.*?(\\d{1,3},\\d{2})\\s+(\\d{1,3},\\d{2})", Pattern.DOTALL);
                Pattern inss843Pattern = Pattern.compile("INSS EMPREGADOR843.*?(\\d{1,3},\\d{2})\\s+(\\d{1,3},\\d{2})", Pattern.DOTALL);

                Matcher matcher = blocoEmpresa.matcher(texto);
                StringBuilder saida = new StringBuilder();

                while (matcher.find()) {
                    String empresa = matcher.group(1).trim().replaceAll("\\s{2,}", " ");
                    String bloco = matcher.group(2);

                    String fgts = "Não encontrado";
                    String inss = "Não encontrado";

                    // FGTS
                    Matcher fgtsMatcher = fgtsPattern.matcher(bloco);
                    if (fgtsMatcher.find()) {
                        fgts = fgtsMatcher.group(1).trim();
                    }

                    // INSS: primeiro tenta 998, depois 843
                    Matcher inssMatcher = inss998Pattern.matcher(bloco);
                    if (inssMatcher.find()) {
                        inss = inssMatcher.group(2).trim(); // valor calculado
                    } else {
                        Matcher fallbackMatcher = inss843Pattern.matcher(bloco);
                        if (fallbackMatcher.find()) {
                            inss = fallbackMatcher.group(2).trim(); // valor calculado
                        }
                    }

                    saida.append(empresa).append(":\n")
                            .append("→ FGTS: R$ ").append(fgts).append("\n")
                            .append("→ INSS: R$ ").append(inss).append("\n\n");
                }

                // Salva no arquivo
                try (FileWriter fw = new FileWriter(p2+"\\resumo.txt")) {
                    fw.write(saida.toString());
                }
                System.out.println("Resumo salvo com sucesso!");
            } else {
                System.out.println("Arquivo da competência atual ainda não gerado");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
