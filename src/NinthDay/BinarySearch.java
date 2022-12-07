package NinthDay;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int length = arr.length;
        int mid = length/2;
        int l = 0;
        System.out.print("Enter a number to search in an array: ");
        int search = sc.nextInt();
        int result = binarySearch(arr, search, l, mid);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at an index: "+result);
        }
    }
    public static int binarySearch(int[] arr, int search,int l,int mid){
        if(l <= mid){
            if (arr[mid] == search) {
                return mid;
            } else if ( search>arr[mid]) {
                l = mid + 1;
                mid = arr.length - 1;
                return binarySearch(arr, search, l, mid);
            } else {
                mid = mid - 1;
                l = 0;
                return binarySearch(arr, search, l, mid);
            }
        }else {
            return -1;
        }
    }
}
