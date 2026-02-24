    package json;

    import com.fasterxml.jackson.core.type.TypeReference;
    import com.fasterxml.jackson.databind.ObjectMapper;

    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Path;
    import java.util.Map;

    //aula 512
    public class DesserializandoUsandoOJackson {

        public static void main(String[] args) throws IOException {
            String json = """
                    {
                        "id": 10,
                        "name": "João",
                        "birthDate": "2004-13-04"
                    }
                    """;
            /*String json = """
                    {"birthDate":"2004-04-13","document":null,"id":1,"name":"João"}""";
            JsonUtils instance = JsonUtils.getInstance();
            System.out.println(instance.getObjectMapper().readValue(json, Client.class));*/

            //PODEMOS DESSEREALIZAR O JSON E UM MAP TAMBEM
            ObjectMapper objectMapper = JsonUtils.getInstance().getObjectMapper();
            Map<String, Object> map = objectMapper.readValue(json, new TypeReference<>() {
            });

            System.out.println(map);

            /*String json = """
                    {
                        "max": 10,
                        "min": 0
                    }
                    """;

            JsonUtils instance = JsonUtils.getInstance();
            System.out.println(instance.getObjectMapper().readValue(json, Range.class));*/

            System.out.println(objectMapper.writeValueAsString(map));
            objectMapper.writeValue(Files.newBufferedWriter(Path.of("file.json")), map);
        }
        private record Range (int max, int min){}
    }
