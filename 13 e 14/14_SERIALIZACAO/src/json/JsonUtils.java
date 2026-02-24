package json;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

//aula 513
//SINGLETON
public final class JsonUtils {

    private static JsonUtils instance;
    private ObjectMapper objectMapper;

    private JsonUtils(){}

    public static JsonUtils getInstance(){
        if (instance == null){
            instance = new JsonUtils();
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);//identa o json
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);//emite dados nulos
            instance.objectMapper = objectMapper;
            return instance;
        }
        return instance;
    }

    public String toJson (Object object){
        try{
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}

/*obs.:
@JsonProperty: altera o nome da propriedade no JSON
@JsonIgnore: ignora uma propriedade na hora de desserializar
@JsonFormat: formata datas
 */

