package json;

import serialization.Client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//aula 513
public class UsandoOSingleton {

    public static void main(String[] args) throws IOException {
        JsonUtils instance = JsonUtils.getInstance();
        JsonUtils instance2 = JsonUtils.getInstance();
        System.out.println(instance.toJson(Client.defaultClient()));
        System.out.println(instance2.toJson(Client.defaultClient()));

        instance.getObjectMapper().writeValue(Files.newBufferedWriter(Path.of("file.json")), Client.defaultClient());
    }
}
