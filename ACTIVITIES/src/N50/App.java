package N50;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(Map.of(
           "Maria", 51991620409L,
           "Pedro", 5199996666L
        ));
        phoneBook.findByName("Maria").ifPresentOrElse(System.out::println, ()->{
            throw new IllegalArgumentException("No such name in phone book");
        });
    }
}
