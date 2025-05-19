package N21;

public class Calc implements Operation{
    @Override
    public int execute(Integer n1, Integer n2) {
        if (n1 == null|| n2 == null) throw new IllegalArgumentException("Os números não podem ser nulos na execução");
        return n1.intValue()+n2.intValue();
    }
}
