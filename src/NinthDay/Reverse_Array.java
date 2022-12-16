package NinthDay;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,9,4}; // 6 // 0-5
        int[] reverse = new int[arr.length];
        int index = 0;
        // arr.length = 6
        for (int i = arr.length-1; i >=0 ; i--) { // i=5 , j=0
            reverse[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(reverse));
    }
}
