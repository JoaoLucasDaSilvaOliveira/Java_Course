package N42;

public class Hero {
    private int ammo;
    private Weapon weapon = new Weapon();

    public Hero (int ammountAmmo){
        ammo = ammountAmmo;
    }

    private class Weapon {
        public void shoot(){
            ammo--;
        }
    }

    public void shoot (){
        weapon.shoot();
    }

    public int getAmmo(){
        return this.ammo;
    }
}
