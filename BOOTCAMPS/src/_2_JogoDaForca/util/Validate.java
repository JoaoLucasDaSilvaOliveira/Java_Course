package _2_JogoDaForca.util;

import _2_JogoDaForca.core.InvalidDigit;

public class Validate {

    private Validate (){}

    public static void validate (boolean condition, String errorMessage) throws InvalidDigit{
        if (condition){
            throw new InvalidDigit("ERROR: "+errorMessage);
        }
    }
    public static String capitalizeFirstOnly(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
