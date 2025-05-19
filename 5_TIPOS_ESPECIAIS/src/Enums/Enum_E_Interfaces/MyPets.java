package Enums.Enum_E_Interfaces;

public enum MyPets implements Pet{
    //podemos fazer o sound ser diferente para cada animal de duas formas diferentes:
    //  1) via construtor:
    //      |
     //     V
    /*CAT ("Miaaaaau"),
    DOG ("Auauau");

    //sendo via construtor precisamos de atributos e do construtor
    private MyPets (String sound){
        this.sound = sound;
    }

   private final String sound;

    @Override
    public String talk(){
        return this.sound;
    }*/
    //ou implementando dessa forma, cada um de um jeito


    CAT {
        @Override
        public String talk() {
            return "Miaaaaaaaau";
        }
    },
    DOG{
        @Override
        public String talk() {
            return "Auauauau";
        }
    };

}
