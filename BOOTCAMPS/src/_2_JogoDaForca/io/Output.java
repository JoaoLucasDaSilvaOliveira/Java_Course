package _2_JogoDaForca.io;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public final class Output {

    private static final PrintWriter OUT;

    static {
        var osw = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
        OUT = new PrintWriter(osw, true);
    }

    private Output (){}

    public static void writeToConsole (){
        writeToConsole(null, true);
    }

    public static void writeToConsole (Object obj){
        writeToConsole(obj, true);
    }

    public static void writeToConsole (Object obj, boolean nextLine){
        if (obj == null){
            OUT.println();
        } else if (nextLine){
            OUT.println(obj);
        } else {
            OUT.format("%s",obj);
        }
    }
}
