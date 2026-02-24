package classeExemplo;

import reflexionApi.Inject;

public class Cachorro {
    @Inject
    private String name;

    @Inject
    private int age;

    public void bark(){
        System.out.println("AUAU");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
