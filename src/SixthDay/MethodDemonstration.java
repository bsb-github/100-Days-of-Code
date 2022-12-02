package SixthDay;

public class MethodDemonstration {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,53,6};
        int index = searchArray(arr, 34);
        int largestNumber = largest(arr);
        System.out.println("Largest "+largestNumber);
        System.out.println("Element found at index "+index);
    }

    public static int searchArray(int[] arr, int culprit){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == culprit){
                return i;
            }
        }
        return -1;
    }

    public static int largest(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
