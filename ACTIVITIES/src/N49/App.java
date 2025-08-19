package N49;

import java.util.*;

public class App {

    private static Map<String, Integer> stringSize = new LinkedHashMap<>();

    public static void main(String[] args) {
        System.out.println(stringAnalize("casa"));
        System.out.println(stringAnalize("casa"));
        System.out.println(stringAnalize("house"));
        System.out.println(stringAnalize("house"));
    }

    private static int stringAnalize (String str){
        return App.stringSize.computeIfAbsent(str, (value) ->{
            System.out.format("Adding value %d for %s", value.length(), value);
            return value.length();
        });
    }
}
