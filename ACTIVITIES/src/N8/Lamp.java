package N8;

public class Lamp {
    public Lamp (boolean state){
        estado = state;
    }
    private boolean estado;

    public void turnOn(){
        if (estado){
            System.out.println("Lámpada já está ligada");
        } else {
            System.out.println("Lâmpada ligada!");
            estado = true;
        }
    }

    public void turnOff(){
        if (!estado){
            System.out.println("Lámpada já está desligada");
        } else {
            System.out.println("Lâmpada desligada!");
            estado = false;
        }
    }

    public void showState (){
        System.out.println("Lâmpada "+ (estado == true ? "ligada" : "desligada"));
    }

}
