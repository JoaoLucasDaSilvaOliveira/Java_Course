package Classes.Interfaces;

//podemos implementar mais de uma interface!
public class Pessoa implements Walkable, Jumpable {
    private int steps;
    private int distancePerSteps;
    @Override
    public void walk() {
        steps++;
        distancePerSteps+=10;
    }

    @Override
    public void stop() {
        steps=0;
    }

    //precisa ser public sempre, pois na interface é publico, e não podemos diminuir o grau de visibilidade
    @Override
    public void jump(){
        walk();
        walk();
    }

    public static void main(String[] args) {
        System.out.println(Jumpable.HEIGHT);
        System.out.println(Pessoa.HEIGHT);
    }
}
