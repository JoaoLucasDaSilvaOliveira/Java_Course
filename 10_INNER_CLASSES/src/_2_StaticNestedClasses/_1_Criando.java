package _2_StaticNestedClasses;

public class _1_Criando {
    //são classes declaradas static dentro de public classes
    //  são classes completamente independentes uma da outra
    //  estão no mesmo codigo fonte apenas por conveniência ao programador ou à título de encapsulamento

    _1_House house = new _1_House("blue", 50);
    //diferente da regular inner class, não precisa de uma instância de House para poder criar um obj Window
    _1_House.Window window = new _1_House.Window("white", "wood");
}
