package EigthDay;

import java.util.Arrays;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
       int[] arr =  {1,23,45,21,5,41,65};
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a element to remove");
       int element = sc.nextInt();
       int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(element == arr[i]){
                index = i;
            }
        }

        if(index > -1){
            for (int i = index; i < arr.length; i++) {
              if(i== arr.length-1){
                  arr[i] = 0;
              }else{
                  arr[i] = arr[i+1];
              }
            }
            System.out.println(Arrays.toString(arr));
        }else{
            System.out.println("Value does not exist");
        }

    }
}
