package EigthDay;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int length;
        System.out.print("Enter Number of Element you want to Sort ");
        length = sc.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(100);
        }
       // System.out.println(Arrays.toString(sort(arr)));


    }
    public  int[] sort(int[] arr){
        int index=0;
        int smallest;
        int i=0;
        while (i<arr.length){
            smallest = arr[i];
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]<=smallest){
                    index = j;
                    smallest = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = smallest;
            arr[index] = temp;
            i++;
        }
        return arr;
    }
}
