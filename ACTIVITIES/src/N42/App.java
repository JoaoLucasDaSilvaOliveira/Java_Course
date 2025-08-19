package N42;

public class App {
    public static void main(String[] args) {
        Hero hero = new Hero(20);
        System.out.println(hero.getAmmo());
        hero.shoot();
        hero.shoot();
        hero.shoot();
        hero.shoot();
        hero.shoot();
        System.out.println(hero.getAmmo());
    }
}
