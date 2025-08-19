package _2_JogoDaForca.io;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public final class Input {

    private Input (){}

    private static final Scanner SCAN = new Scanner(System.in);

    public static List<String> readLinesFromFile(String FILE_PATH){
        URL url = Input.class.getResource(FILE_PATH);
        if (url == null){
            throw new RuntimeException("File not found: "+FILE_PATH);
        }
        try{
            return Files.readAllLines(Path.of(url.toURI()), StandardCharsets.UTF_8);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException("ERROR: in loading dictionary");
        }
    }

    public static String readFromKeyBoard (String message){
        if (message != null){
            Output.writeToConsole(message, false);
        }
        return SCAN.nextLine();
    }
}
