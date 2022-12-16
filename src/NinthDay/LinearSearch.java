package NinthDay;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter a number to search in an array: ");
        int search = sc.nextInt();
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if(search == arr[i]){
                isFound = true;
                System.out.println("Element found at Index "+i);
                break;
            }
        }
        if(isFound == false){
            System.out.println("Element Not Found");
        }

    }
}
