package N41;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        try(
                Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\jlso9\\Desktop\\Curso_Java\\ACTIVITIES\\src\\N41\\data.in"))));
                PrintWriter pw = new PrintWriter("C:\\Users\\jlso9\\Desktop\\Curso_Java\\ACTIVITIES\\src\\N41\\data.out");
        ) {
            while (scan.hasNext()){
                scan.useDelimiter("\\.");
                pw.println(scan.next());
            }
        }
    }
}
