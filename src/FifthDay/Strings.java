package FifthDay;

public class Strings {
    public static void main(String[] args) {
        String sentence;
        sentence = "Now is the time for the birthday party";
        System.out.println("Sentence => "+sentence);
        System.out.println("Length of Sentences: "+sentence.length());
        System.out.println("Character at index 16: "+sentence.charAt(16));
        System.out.println("Substring from index 5 => "+sentence.substring(5));
        System.out.println("Substring between 8 and 16 =>"+sentence.substring(8, 16));
        System.out.println("Index of t "+sentence.indexOf('t'));
        System.out.println("Index of \"for\" "+sentence.indexOf("for"));
        System.out.println("Sentence to upperCase --> "+sentence.toUpperCase());
        System.out.println("Sentence to lowerCase --> "+sentence.toLowerCase());
        System.out.println("Replace r wit R --> "+sentence.replace('r','R'));




    }
}
