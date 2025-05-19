package N20;

public enum Operation {
    SUM ('+'),
    SUBSTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    Operation(char symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return Character.toString(symbol);
    }

    public double calculate (double n1, double n2){
        return switch (this){
            case SUM -> n1+n2;
            case SUBSTRACT -> n1-n2;
            case MULTIPLY -> n1*n2;
            case DIVIDE -> n1/n2;
        };
    }
}
