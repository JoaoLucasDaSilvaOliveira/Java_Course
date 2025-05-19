package N7;

/**
 * ORIENTAÇÃO:
 *  Crie as classes Watch e Pointer
 *  Funcionará como um relógio, demais orientações nos slides do curso
 */
public class App {
    public static void main(String[] args) {
        Watch relogio = new Watch();
        relogio.setTime(8, 50, 30);
        relogio.show();
        System.out.println(relogio.hour.number +"\n"+ relogio.minute.number +"\n"+ relogio.second.number);
    }
}
