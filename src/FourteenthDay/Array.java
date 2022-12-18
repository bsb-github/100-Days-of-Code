package FourteenthDay;

import java.util.Arrays;
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr = {1,2,3,4,5,6,7,8,9}; // 3
       System.out.print("Enter a Number to remove from an element: ");
       int target = sc.nextInt();
       int[] arrNew = new int[arr.length-1];
       int k = 0;
       for (int i = 0; i < arr.length; i++) {
        if(arr[i] == target){
            arrNew[k] = arr[i+1];
        }else{
            arrNew[k] = arr[i];
            k++;
        }
        
       }
       System.out.println(Arrays.toString(arrNew));
    }
}