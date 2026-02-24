package Class_Content;

public class TextBlocks {
    public static void main(String[] args) {
        //notação: """ texto """;
        //caso use, é necessário ter mais de uma linha no texto;
        //usa a mesma formatação que a usada no editor de texto;
        String block = """
                Olá, mundo!
                    Tudo bem com você?
                  Mais ou menos!
                """;
        System.out.println(block);
    }
}
