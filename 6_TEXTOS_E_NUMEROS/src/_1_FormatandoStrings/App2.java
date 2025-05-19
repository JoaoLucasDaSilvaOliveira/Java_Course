package _1_FormatandoStrings;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class App2 {
    public static void main(String[] args) {
        double nro = 10.0;
        String nome = "João";
        String ac = "123";
        double nro2 = 20.0;
        String nome2 = "Pedro";
        String ac2 = "12335-6";
        double nro3 = 50.0;
        String nome3 = "Rodrigo";
        String ac3 = "12354-8";
        // coloca espaços para todas as strings ficarem do mesmo tamanho
                        //   |
                        //   v
        System.out.format("%-7s - %s: %f\n", ac, nome, nro);
        System.out.format("%-7s - %s: %f\n", ac2, nome2, nro2);
        System.out.format("%-7s - %s: %f\n", ac3, nome3, nro3);
        //saída: 123     - João: 10,000000
        //       12335-6 - Pedro: 20,000000
        //       12354-8 - Rodrigo: 50,000000

        System.out.format("%7s -\t\t%-15s: %f\n", ac, nome, nro);
        System.out.format("%7s - \t\t%-15s: %f\n", ac2, nome2, nro2);
        System.out.format("%7s - \t\t%-15s: %f\n", ac3, nome3, nro3);
        //saída:    123 -		João           : 10,000000
        //      12335-6 - 		Pedro          : 20,000000
        //      12354-8 - 		Rodrigo        : 50,000000

        //formatando nros
                            // delimita as casas após a vírgula
                            //              |
                            //              v
        System.out.format("%7s -\t\t%-15s: %.2f\n", ac, nome, nro);
        System.out.format("%7s - \t\t%-15s: %.2f\n", ac2, nome2, nro2);
        System.out.format("%7s - \t\t%-15s: %.2f\n", ac3, nome3, nro3);
        //saída:     123 -		João           : 10,00
        //       12335-6 - 		Pedro          : 20,00
        //       12354-8 - 		Rodrigo        : 50,00

        //formantando numero -> string
        double n = 3456.21;
        Locale america = Locale.ENGLISH;
        NumberFormat nf = NumberFormat.getInstance(america);
        String strformatted = nf.format(n);
        System.out.println("Padrão americano: "+strformatted);

        Locale brasil = Locale.of("pt", "br");
        NumberFormat br = NumberFormat.getInstance(brasil);
        String strFormatted = br.format(n);
        System.out.println("Padrão brasileiro: "+strFormatted);

        //formatação monetária
                                     //padrão monetário brasileiro
        NumberFormat real = NumberFormat.getCurrencyInstance(brasil);
        String dinheiro = real.format(1000);
        System.out.println(dinheiro);

        //customizando o NumberFormat
        NumberFormat n1 = NumberFormat.getInstance();
        // retira (false) ou coloca (true) o separador de milhar da string
        n1.setGroupingUsed(false);
        System.out.println(n1.format(1000000.12));

        //seta o máximo e o mínimo de casas decimais
        //preenche com 0 caso não chegue o tamanho
            /*n1.setMinimumFractionDigits(4);
            System.out.println(n1.format(100000.1));*/
        //limita o tamanho das casas após a vírgula
            /*n1.setMaximumFractionDigits(4);
            System.out.println(n1.format(10000.6));*/

        //seta o máximo e o mínimo de casas inteiras
        //faz tudo da esquerda para a direita
        //preenche com 0 caso não chegue o tamanho
            /*n1.setMinimumIntegerDigits(4);
            System.out.println(n1.format(10.1));*/
        //limita o tamanho das casas antes a vírgula
            /*n1.setMaximumIntegerDigits(4);
            System.out.println(n1.format(10000.6));*/

        //conseguindo padrões monetários
        NumberFormat money = NumberFormat.getCurrencyInstance();
        money.setCurrency(Currency.getInstance("BRL"));
        System.out.println(money.format(15));

        //conseguindo as currencys disponíveis
        System.out.println(Currency.getAvailableCurrencies());
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
    }
}
