package serialization;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class Serializando {

    public static void main(String[] args) throws IOException {
        Client client = new Client(1, "João", LocalDate.of(2004, 4, 13), null);

        Path path = Path.of("14_SERIALIZACAO/src/serialization/objectOutputstream/output.bin");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(client);
        }
    }
}
