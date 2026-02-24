//package N55;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//
//import static serialization.SerializationUtils.fromFile;
//import static serialization.SerializationUtils.toFile;
//
//
//public class App {
//
//    private static final Path PATH = Path.of("ACTIVITIES/src/N55/numbers.out.bin");
//
//    public static void main(String[] args) {
//
//        Random r = new Random();
//
//        if (Files.exists(PATH)){
//            List<Double> listFromFile = fromFile(PATH, List.class);
//            listFromFile.add(r.nextDouble());
//            toFile(listFromFile, PATH);
//        } else {
//            toFile(new ArrayList<>(List.of(r.nextDouble()   )), PATH);
//        }
//        fromFile(PATH, List.class).forEach(System.out::println);
//    }
//
//}
