package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public final class SerializationUtils {

    private SerializationUtils (){}

    public static void toFile (Object obj, Path file){
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file))){
            oos.writeObject(obj);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static <T> T fromFile (Path file, Class<T> clazz){
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file))){
            Object obj = ois.readObject();
            return clazz.cast(obj);
        } catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

}
