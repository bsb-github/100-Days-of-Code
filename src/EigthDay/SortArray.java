package EigthDay;

import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {12,1,0,34,-1,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int smallest;
        int index = 0;

        for (int i = 0; i < arr.length ; i++) {
            // 0 -> arr ki length
           // jitna sort utna part mn help
            smallest = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= smallest) {
                    index = j;
                    smallest = arr[j]; // 11
                }
            }
            int temp = arr[i];
            arr[i] = smallest;
            arr[index] = temp;// i=1 => 12 1 => 12
        }
        return arr;
    }
}
