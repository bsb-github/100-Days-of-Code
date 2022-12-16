package TenthDay;

import java.util.Arrays;
import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 Values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        modify(arr);
        System.out.print("[");
        for (int j : arr) {
            System.out.print(j + " ,");
        }
        System.out.print("]");
    }
    public static void modify(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i] * 3;
        }
    }
}
