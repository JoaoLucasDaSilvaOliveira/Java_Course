package N48;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3,6,2,4,9,7,1,5,8,0));
        changeList(numbers);
    }
    public static void changeList (List<Integer> list){
        list.replaceAll(n-> n+2);
        list.removeIf(n -> n%2==0);
        list.sort(Comparator.reverseOrder());
        list.forEach(System.out::println);
    }
}
