package N27;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Dice dado = Dice.roll();
        System.out.println(dado);
    }
}

class Dice {
    public int upperSide;
    public int lowerSide;

    private Dice (int n, int m){
        upperSide=n;
        lowerSide=m;
    }

    public static Dice roll(){
        Random r = new Random();
        return new Dice(r.nextInt(1,7), r.nextInt(1,7));
    }

    @Override
    public String toString() {
        return "Dice{" +
                "upperSide=" + upperSide +
                ", lowerSide=" + lowerSide +
                '}';
    }
}
