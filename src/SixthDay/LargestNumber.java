package SixthDay;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,32,15,6,10,11};
        int largest=arr[0];
        for (int i =1; i < arr.length ; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest is "+largest);
    }
}
