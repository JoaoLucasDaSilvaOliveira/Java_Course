package N19;

public enum Week {
    DOMINGO (1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);

    private final int  WeekNumber;

    private Week (int number){
        this.WeekNumber = number;
    }

    public int getWeekNumber() {
        return WeekNumber;
    }

    public Week next (){
        if (this == SABADO){
            return DOMINGO;
        }
        else {
            for (Week day : Week.values()){
                if (day.getWeekNumber() == this.WeekNumber+1){
                    return day;
                }
            }
        }
        return null;
    }
}
