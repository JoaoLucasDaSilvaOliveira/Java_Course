package _2_WildCards;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //observe:
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bus bus = new Bus();
        vehicle.drive();
        car.drive();
        bus.drive();
        //isto funciona normalmente
        //agora observe isso:
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car);
        driveVehicles(vehicleList);//veja que isto compila e funciona, agora veja o próx exemplo:

        List<Car> carList = new ArrayList<>();
        carList.add(car);
        //driveVehicles(carList); isto gera um erro. Pq? sendo que carro é um Vehicle? Com generics, dessa forma, precisamos passar
        //  exatamente o tipo quando estamos falando de parâmetros. Nesse caso, a função espera receber uma lista do tipo Vehicle especificamente. Por mais que mediante o polimorfismo, entendemos que Car é um Vehicle, com generics, precisamos passar especificamente um Vehicle, não seu super ou sub-tipos!

        //pensando nessa questão, os engenheiros do Java fizeram os wildCards! Observe a função driveVehiclesWildCards:
        //dessa forma podemos oferecer à função a nossa lista
        driveVehiclesWildCards(carList);

        //OBS.: wildCards tem uma sintaxe assim quando quer receber qualquer coisa: <? extends Object> ou <?> (são o mesmo, quase).

        //outra função dos wildCards seria quando queremos restringir, ao invés de que herda a classe, de quem a classe é filha
        //observe a diferença
        List<? extends Vehicle> l1 = new ArrayList<Car>(); // aqui temos uma lista genérica de algo que extenda Vehicle ou que seja um Vehicle, neste caso, Car.
        List<? super Car> l2 = new ArrayList<Vehicle>();// aqui temos uma lista genérica de algo que seja pai de Car ou o próprio Car, nesse caso, Vehicle.
        //Oberve que se tivermos uma classe que extenda Car, podemos utilizar como na l1, mas não como na l2. Observe:
        class BMW extends Car{
            @Override
            public void drive() {
                System.out.println("Driving BMW");
            }
        }
        List<? extends Vehicle> l3 = new ArrayList<BMW>(List.of(new BMW()));
        l3.forEach(Vehicle::drive);
//        List<? super Car> l4 = new ArrayList<BMW>(); ERRO
        //QUANDO CRIAMOS UM GENERICS COM EXTENDS, CRIAMOS UMA LISTA IMUTÁVEL!
        //COM CRIAMOS COM SUPER NÃO, PODEMOS MUDAR. ENTRETANTO O RETORNO DA LISTA SEMPRE SERÁ UM OBJECT
    }
    public static void driveVehicles (List<Vehicle> vehicleList){
        vehicleList.forEach(Vehicle::drive);
    }

    //temos uma função que recebe por parâmetro uma lista de algo que extenda Vehicle ou um próprio Vehicle
    public static void driveVehiclesWildCards (List<? extends Vehicle> vehicles){
        vehicles.forEach(Vehicle::drive);
    }

    static class Vehicle {
        public void drive(){

        }

    }
    static class Car extends Vehicle {
        @Override
        public void drive() {
            System.out.println("Driving Car");
        }
    }
    static class Bus extends Vehicle {
        @Override
        public void drive() {
            System.out.println("Driving Bus");
        }
    }
}
