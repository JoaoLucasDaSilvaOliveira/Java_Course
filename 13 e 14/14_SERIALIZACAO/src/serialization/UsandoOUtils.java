package serialization;

import java.nio.file.Path;
import java.time.LocalDate;

import static serialization.SerializationUtils.*;

public class UsandoOUtils {

    private static final Path PATH = Path.of("14_SERIALIZACAO/src/serialization/objectOutputstream/obj.bin");

    public static void main(String[] args) {
        Client client = new Client(2, "Pedrinho matador", LocalDate.of(1975, 1, 30), "Preso");
        toFile(client, PATH);
        System.out.println(fromFile(PATH, client.getClass()));
    }

}
