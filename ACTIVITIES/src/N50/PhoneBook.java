package N50;

import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private final Map<String, Long> map;

    public PhoneBook(Map<String, Long> map) {
        this.map = map;
    }

    public Optional<Long> findByName (String name){
        for (String n : map.keySet()){
            if (name.equals(n)){
                return Optional.of(map.get(n));
            }
        }
        return Optional.empty();
    }
}
