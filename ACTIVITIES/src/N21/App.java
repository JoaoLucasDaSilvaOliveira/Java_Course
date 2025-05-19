package N21;

public class App {
    public static void main(String[] args) {
        Calc soma = new Calc();
        try{
            System.out.println(soma.execute(1,null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
