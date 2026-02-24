package reflexionApi;

import classeExemplo.Cachorro;

public class App1 {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = Factory.create(Cachorro.class);
        cachorro.bark();
        System.out.println(cachorro.getName());
        System.out.println(cachorro.getAge());
    }
}
