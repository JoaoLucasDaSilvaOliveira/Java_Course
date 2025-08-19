package _2_JogoDaForca.core;

import _2_JogoDaForca.io.Input;
import _2_JogoDaForca.util.Validate;

import java.util.List;
import java.util.Random;

public class Dictionary {

    private static final Dictionary INSTANCE = new Dictionary();
    private final List<String> words;
    private static final String FILE_PATH = "/_2_JogoDaForca/resourses/dictionary.txt";

    /*public Dictionary (){
        words = Input.readLinesFromFile(FILE_PATH);
    }*/

    public Word nextWord (){
        Random number = new Random();
        int pos = number.nextInt(0, words.size());
        String valid = Validate.capitalizeFirstOnly(words.get(pos));
        return new Word(valid);
    }

    //transformando a classe em sigleton
    private Dictionary (){
        words = Input.readLinesFromFile(FILE_PATH);
    }

    public static Dictionary getInstance (){
        return INSTANCE;
    }
}
