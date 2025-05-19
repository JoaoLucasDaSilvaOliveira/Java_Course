package N6;

public class Fraction {
    public double numerador;
    public double denominador;

    public void set (double numerador, double denominador){
        if (denominador != 0.0){
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }
    public Fraction multiplication (double numerador, double denominador){
        if (denominador !=0.0){
            Fraction newFraction = new Fraction();
            newFraction.denominador = this.denominador * denominador;
            newFraction.numerador = this.numerador * numerador;
            return newFraction;
        }
        return null;
    }
}
