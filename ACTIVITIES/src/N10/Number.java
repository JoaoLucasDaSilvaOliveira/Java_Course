package N10;

public class Number {
    //segunda parte do exercicio
    //|
    //V
    private Number(int num) {
        number = num;
        numbersCreated++;
    }

    private int number;
    public static int numbersCreated = 0;

    public int getNumber() {
        return number;
    }

    public void increment (){
        number++;
    }

    public static Number add(Number number1, Number number2){
        return new Number(number1.getNumber()+number2.getNumber());
    }

    public static Number newNumber (int n){
        return new Number(n);
    }
}
