package _1_RegularInnerClass;


public class _2_InstanciandoDeFora {
    _2_Carro car = new _2_Carro();
    //instanciando uma inner class de carro
    _2_Carro.Door door = car.new Door();
    //precisa primeiro instanciar um carro pra depois instanciar uma portal

}

