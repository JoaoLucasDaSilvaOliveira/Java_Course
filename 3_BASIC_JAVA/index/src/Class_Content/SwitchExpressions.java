package Class_Content;

public class SwitchExpressions {
    public static void main(String[] args) {
        int number = 1, month = 5;
        //switch normal
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }
        //switch diferente
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                number = 31;
                break;
            case 2:
                number = 28;
                break;
            default:
                number = 0;
                break;
        }
        System.out.println(number);

        //switch expression
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            default -> 0;
        };
        System.out.println(days);
    }
}
