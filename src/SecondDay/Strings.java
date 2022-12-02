package SecondDay;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        // What is String
        String name = "Bismillah Sharif";
        int length =  name.length();
        String toUp = name.toUpperCase();
        String toLow = name.toLowerCase();
        char c = name.charAt(4);
        String replaced = name.replace('i', 'I');
        boolean isEqual = name.equals(toUp);
        String concat = toUp.concat(toLow);
        boolean contain = name.contains("L");
        String getSpecificPArt = name.substring(4, 7);
        String trimmed = name.trim();
        boolean ends = name.endsWith("f");
        int index = name.indexOf("i");
        boolean isempty =  name.isBlank();
        char[] chars = name.toCharArray();

    }
}
