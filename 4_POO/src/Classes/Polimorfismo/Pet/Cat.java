package Classes.Polimorfismo.Pet;

public class Cat extends Pet{
    @Override
    public void feed() {
        System.out.println("Cat eating");
    }
    public void sit (){
        System.out.println("Cat sitting");
    }
}
