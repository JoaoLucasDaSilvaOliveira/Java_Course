package json;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import serialization.Client;

public class EntendendoOJackson {


    public static void main(String[] args) throws JsonProcessingException {
        //core do jackson, é ele quem transforma os dados em string (JSON)
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        Client client = Client.defaultClient();

        String json = objectMapper.writeValueAsString(client);

        System.out.println(client);

        System.out.println(json);
    }
}
