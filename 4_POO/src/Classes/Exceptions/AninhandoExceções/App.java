package Classes.Exceptions.AninhandoExceções;

public class App {
    public static void main(String[] args) {
        AcountService ac = new AcountService();
        try{
            ac.createAndWithdraw("01", 1100);
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }
    }
}
