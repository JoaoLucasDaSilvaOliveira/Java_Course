package Class_Content;

public class TernaryIf {
    public static void main(String[] args) {
        int age = 18;
//        String text;
//        if (age >= 18)
//        {
//            text = "Pode beber";
//        } else {
//            text = "Não pode entrar";
//        }
        String text = age >= 18 ? "Pode beber" : "Não pode beber";
        System.out.print(text);
    }
}
