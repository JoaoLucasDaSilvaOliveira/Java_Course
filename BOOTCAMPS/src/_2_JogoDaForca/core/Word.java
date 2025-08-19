package _2_JogoDaForca.core;

import java.text.Normalizer;

import java.util.Arrays;

import static java.text.Normalizer.normalize;

public class Word {

    private static final char HIDDEN_CHAR = '_';
    private final char[] letters;
    private final char[] hiddenLetters;
    private int chances = 10;

    public Word (String text){
        letters = text.toCharArray();
        hiddenLetters = new char[letters.length];
        Arrays.fill(hiddenLetters, HIDDEN_CHAR);
    }

    public boolean reveal (Character letter) throws Exception{
        boolean foundedLetter = false;
        if (letter == null){
            chances--;
        } else {
            for (int i = 0; i < letters.length; i++) {
                String aux = String.valueOf(Character.toLowerCase(letter));
                String aux2 = String.valueOf(Character.toLowerCase(letters[i]));
                String aux3 = String.valueOf(Character.toLowerCase(hiddenLetters[i]));
                if ( aux.equals(normalize(aux2, Normalizer.Form.NFD))) {
                    if (aux.equals(normalize(aux3, Normalizer.Form.NFD))){
                        chances--;
                        throw new Exception(String.format("Theres is already an %s in there!", aux));
                    }
                    hiddenLetters[i] = letters[i];
                    foundedLetter = true;
                }
            }
            if (!foundedLetter) {
                chances--;
            }
        }
        return foundedLetter;
    }

    public boolean isDiscovered(){
        return Arrays.compare(letters, hiddenLetters) == 0;
    }

    public int getChances (){
        return chances;
    }

    public String getWord (){
        StringBuilder sb = new StringBuilder();
        for (char c : letters){
            sb.append(c);
        }
        return sb.toString();
    }

    public String getHiddenWord (){
        StringBuilder sb = new StringBuilder();
        for (char c : hiddenLetters){
            sb.append(c);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char c : hiddenLetters){
            sb.append(c);
        }
        return String.format("%-10s Chances: %d", sb.toString(), chances);
    }
}
