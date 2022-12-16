package TenthDay;

import java.util.Arrays;
import java.util.Random;

public class OccurenceOfCharacterInAnArray {
    public static void main(String[] args) {
       char[] chars = createArray();

       int[] count = countCharacter(chars);

        displayOccurence(count);
    }
    static char[] createArray(){
        Random random =  new Random();
        String chars = "abcdefghijklmnopqrstuvwxyz";
        char[] arr = new char[100];
        for (int i = 0; i < arr.length; i++) {
            int rand = random.nextInt(26);
            arr[i] = chars.charAt(rand);
        }
        return arr;
    }
    static int[] countCharacter(char[] arr){
        int[] count = new int[26];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - 'a']++; // z => 122 a=> 97 => 1 // 0+1 => 1
        }
        return count;
    }
    static void displayOccurence(int[] count){
        for (int i = 0; i < count.length; i++) {
            char alphabet = (char) (i + 97);
            System.out.println(alphabet + " -> " + count[i]);
        }
    }
}
