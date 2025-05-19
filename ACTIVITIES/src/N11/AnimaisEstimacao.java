package N11;

public class AnimaisEstimacao {
    public AnimaisEstimacao (String color){
        this.color = color;
    }
    protected String color;

    @Override
    public String toString() {
        return "AnimaisEstimacao \n{\n" +
                "\tcolor='" + color + '\'' +
                "\n}";
    }
}
