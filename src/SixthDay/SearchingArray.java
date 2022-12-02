package SixthDay;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {2,5,1,6,3};
        Arrays.sort(arr1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find ");
        int a = sc.nextInt();
        // Linear Search
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a){
                System.out.println("Element found at index: "+i);
                break;
            }
        }
    }
}
