package _2_JogoDaForca.core;

import _2_JogoDaForca.io.Input;
import _2_JogoDaForca.io.Output;
import _2_JogoDaForca.util.Validate;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final Dictionary dictionary = Dictionary.getInstance();
    private final Word word = dictionary.nextWord();
    private List<Character> wrongLetters = new ArrayList<>();

    public void start (){
        while (!word.isDiscovered() && word.getChances() > 0 ){
            play();
        }
        Output.writeToConsole(word);
        if (word.isDiscovered()){
            Output.writeToConsole("Congratulations! You did it!");
        } else {
            Output.writeToConsole("Oh, better luck next time!\nThe word was: "+word.getWord());
        }
    }

    private void play (){
        Output.writeToConsole(word);
        if (!wrongLetters.isEmpty()){
            Output.writeToConsole("Wrong letters you tried: ", false);
            for (int i=0; i<wrongLetters.size(); i++){
                if (i == wrongLetters.size()-1){
                    Output.writeToConsole(wrongLetters.get(i), true);
                } else {
                    Output.writeToConsole(wrongLetters.get(i)+", ", false);
                }
            }
        }
        String text = Input.readFromKeyBoard("Please, enter a letter: ");
        try {
            if (!validateEntry(text)) {
                word.reveal(null);
            } else {
                boolean shot = word.reveal(text.charAt(0));
                if (!shot) {
                    Output.writeToConsole(String.format("Ops, looks like there is no %s in there!", text.charAt(0)));
                    wrongLetters.add(text.charAt(0));
                }
            }
        } catch (Exception e) {
            Output.writeToConsole(e.getMessage());
        }
    }

    private boolean validateEntry (String text){
        text = text.trim();
        try{
            Validate.validate(text.isBlank(), "Letter cannot be empty");
            Validate.validate(!Character.isLetter(text.charAt(0)), "Please, enter a letter. Numbers and other digits are not allowed");
            Validate.validate(text.length() > 1, "Please, enter just one letter");
            return true;
        } catch (InvalidDigit e) {
            Output.writeToConsole(e.getMessage());
            return false;
        }
    }
}
