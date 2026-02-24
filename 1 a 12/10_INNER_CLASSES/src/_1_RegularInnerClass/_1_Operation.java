package _1_RegularInnerClass;

public class _1_Operation {
    private final int value1;
    private final int value2;

    public _1_Operation (int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public int execute (){
        Sum sum = new Sum();
        return sum.calculate (value1, value2);
    }

    //inner class
    //  criando dessa forma apenas a classe operation pode ver a classe Sum
    private class Sum {
        public int calculate (){
            //essa classe "enxerga" os atributos da classe "mãe"
            return value1+value2;
        }
    }
}
