package Classes.JavaRecords;

public class App {
    public static void main(String[] args) {
        Record pessoa = new Record("João", 1.71, 21);
        Record pessoa2 = new Record("João", 1.71, 21);
        Record pessoa3 = new Record("Pedro", 23);
        System.out.println(pessoa.toString());
        System.out.println(pessoa.hashCode());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa2.hashCode());
        System.out.println(Record.getInstances());
    }
}
