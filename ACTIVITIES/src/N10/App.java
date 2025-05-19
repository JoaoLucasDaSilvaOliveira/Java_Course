package N10;

public class App {
    public static void main(String[] args) {
//        System.out.println(Number.numbersCreated);
//        var n1 = new Number(2);
//        System.out.println(n1.getNumber()+"\n"+Number.numbersCreated);
        //dessa forma fazemos com que a criação de novas instancias seja feita apenas a partir do metodo da classe
        Number num = Number.newNumber(10);
    }
}
