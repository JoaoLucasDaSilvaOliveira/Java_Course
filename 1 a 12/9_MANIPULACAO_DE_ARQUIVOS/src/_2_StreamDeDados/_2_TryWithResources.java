package _2_StreamDeDados;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class _2_TryWithResources {
    public static void main(String[] args) {
        //entendendo o try with resources
        // imagine que você tem a seguinte tarefa: faça um código que abra um arqv. Você faz assim:
        try {
            FileWriter out = new FileWriter("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\out.txt", StandardCharsets.UTF_8);
            try{
                out.write("Hello World");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //mas isso é ridiculamente grande e desnecessário. É preciso seguir todos esses passos pois a var do arquivo deve ser aberta para
        // a escrita e fechada após a escrita, logo precisamos de um try { try {...} catch(..){...}finally{nomeVar.close()}} catch(..){...}
        //pensando nesse tipo de problema, foi criado o try with resources, no qual chama automaticamente o métod-o close
        //  mas como o java sabe que é pra chamar o métod-o close? Simples, o try with resources só aceita que crie vars dentro dele se o
        //  tipo de var implementar a interface AutoCloseable. Interface essa que possui um único métod-o chamado close

        try (FileWriter out = new FileWriter("C:\\Users\\jlso9\\Desktop\\Curso_Java\\9_MANIPULACAO_DE_ARQUIVOS\\src\\Examples\\Streams\\out.txt", StandardCharsets.UTF_8)){
            out.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
