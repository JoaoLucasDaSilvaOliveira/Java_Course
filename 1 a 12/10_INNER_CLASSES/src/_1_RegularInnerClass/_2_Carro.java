package _1_RegularInnerClass;

public class _2_Carro {
    private int speed;
    private final Engine engine = new Engine();
    //testando possíveis problemas
    private boolean on;

    public void accelerate () {
        engine.injectFuel();
    }

    public int getSpeed (){
        return this.speed;
    }

    private class Engine {
        public void injectFuel(){
            speed+=10;
        }
        //testando possíveis problemas
        private boolean on;
        public boolean isAllOn(){
            return this.on && _2_Carro.this.on;
        }
    }

    //classe a ser instanciada fora da Outer Class
    public class Door {
        private boolean isOpen;

        public void open (){
            isOpen = true;
        }
        public void close (){
            isOpen = false;
        }
    }

}
