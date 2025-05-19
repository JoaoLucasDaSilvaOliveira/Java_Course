package N18;

public class App {
    public static void main(String[] args) {
        String s = upperCaseStr("Java é uma linguagem de programação", "uma");
        System.out.println(s);
    }
    public static String upperCaseStr(String textoOriginal, String textoReplace){
        return textoOriginal.replace(textoReplace, textoReplace.toUpperCase());
    }
}
