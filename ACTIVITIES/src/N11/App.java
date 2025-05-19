package N11;

public class App {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Preto");
        System.out.println(dog.toString());
    }
}

abstract  class EarthPet extends AnimaisEstimacao {
    public EarthPet (String color){
        super(color);
    }

    public void andar(){
        System.out.println("Andando");
    }
    public void falar(){
    }
}

abstract  class WaterPet extends AnimaisEstimacao{
    public WaterPet (String color){
        super(color);
    }
    public void nadar(){
        System.out.println("Nadando");
    }
}

class Cachorro extends EarthPet{
    public Cachorro (String color){
        super(color);
    }
    @Override
    public void falar() {
        System.out.println("Auauau");
    }
}

class Gato extends EarthPet{
    public Gato (String color){
        super(color);
    }
    @Override
    public void falar(){
        System.out.println("Miauau");
    }
}

class Peixe extends WaterPet{
    public Peixe (String color){
        super(color);
    }
}
