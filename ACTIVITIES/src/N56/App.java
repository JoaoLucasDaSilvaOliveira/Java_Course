//package N56;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import json.JsonUtils;
//
//import java.io.File;
//import java.util.List;
//
//public class App {
//    public static void main(String[] args) throws Exception{
//        System.out.println(JsonUtils.getInstance().getObjectMapper().readValue(new File("ACTIVITIES/src/N56/content.json"), Books.class));
//    }
//}
////classe principal do exercicio que representa o objeto
//record Book (
//        String titulo,
//        String isbn,
//        @JsonProperty(value = "num_pag")
//        int numPag
//){}
////classe que representa a lista de livros
//record Books (
//        List<Book> books
//){}
