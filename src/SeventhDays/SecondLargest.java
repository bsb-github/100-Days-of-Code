package SeventhDays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2,6};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == largest){

            }else if(secondLargest<arr[i]){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
