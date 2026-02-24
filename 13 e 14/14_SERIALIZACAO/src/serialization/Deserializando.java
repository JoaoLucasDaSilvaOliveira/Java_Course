package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Deserializando {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("14_SERIALIZACAO/src/serialization/objectOutputstream/output.bin");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Client client = (Client) ois.readObject();
            System.out.println(client);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
