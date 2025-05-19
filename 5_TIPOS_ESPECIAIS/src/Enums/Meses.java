package Enums;

public enum Meses {
    //todo enum é uma classe

    //passamos a esses valores, o construtor!
    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3);

    private final int monthNum;

    //todos os contrutores do enum são privados por padrão!
    Meses(int monthNum){
        this.monthNum = monthNum;
    }

    public int getMonthNum() {
        return monthNum;
    }

    @Override
    public String toString() {
        return "Mês: "+this.name();
    }

    //enum e switch expressions
    public int numberOfDays(){
        return switch (this){
            case JANEIRO, MARCO -> 31;
            case FEVEREIRO -> 28;
        };
    }
}
