package EleventhDay;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int start = 0;
        int end = arr.length -1;
        boolean found = false;

        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
