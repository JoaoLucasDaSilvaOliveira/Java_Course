package Strings;

public class StringBuilder_ex {
    //quando concatenamos String, sempre criamos novos objetos na memória, perdendo em desempenho
    //  visando isto usamos o StringBuilder, ele não funciona da mesma forma e só constrói a String de fato
    //  quando chamamos o .toString();
    //Sempre ter atenção fazer concatenação em LOOPS!!!

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        for (char c = 'A'; c <= 'Z'; c ++){
            //coloca na última posição
            s.append(c) ;
        }
        System.out.println(s);

        //OPERAÇÕES RELEVANTES COM STRINGS OU STRINGBUILDERS
        //      SUBSTRING
        String str = "Javinha";
        System.out.println(str.substring(0,4));
        //      TRIM: tira os espaços do início e fim
        String str2 = "    java     ";
        System.out.println(str2);
        System.out.println(str2.trim());
        //      LENGTH: tamanho da string
        System.out.println(str2.trim().length());
        //      INDEXOF: encontra onde está o texto, retorna o index da primeira ocorrência
        String str3 = "Java é do balacobaco";
        System.out.println(str3.indexOf("aco"));
        System.out.println(str3.lastIndexOf("aco"));
        //      REPLACE: retorna uma nova String com a mudança; Caso não encontre, retorna a String original sem mudança
        System.out.println(str3.replace("do balacobaco", "show"));
        System.out.println(str3);
        //      COMPARETO: retorna um int, enquanto equals retorna true ou false
                // compara alfabeticamente, conseguimos saber se a palavra vem antes ou depois da outra
                // retorna 0 quando iguais
                // retorna - quando a string comparada vem depois da chamada
                // retorna + quando a string comparada vem antes da string chamada
        String str4 = "Estou aqui";
        String str5 =  "Estou aqui";
        System.out.println(str4.compareTo(str5));
        System.out.println(str4.equals(str5));
    }
}
