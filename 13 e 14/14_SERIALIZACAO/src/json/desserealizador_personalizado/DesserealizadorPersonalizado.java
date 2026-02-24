package json.desserealizador_personalizado;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import json.JsonUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

//aula 514
public class DesserealizadorPersonalizado {
    public static void main(String[] args) throws IOException {
        JsonUtils instance = JsonUtils.getInstance();
        Range range = instance.getObjectMapper().readValue(new File("14_SERIALIZACAO/src/json/desserealizador_personalizado/jsonPersonalizado.json"), new TypeReference<>() {
        });
        System.out.println(range);
    }

    @JsonDeserialize(using = RangeDeserializer.class) // isso faz com que quando for desserealizar essa classe, use o deserealizador especial
    private record Range (int min, int max){}

    private static class RangeDeserializer extends StdDeserializer<Range> {
        public RangeDeserializer (){this(null);}

        protected RangeDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Range deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
            //getCodec = getObjectMapper
            JsonNode node = jsonParser.getCodec().readTree(jsonParser);
            String rangeStr = node.get("range").asText();
            String[] split = rangeStr.split("\\.\\.");
            return new Range(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
    }
}
