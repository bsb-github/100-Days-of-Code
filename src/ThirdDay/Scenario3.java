package ThirdDay;

public class Scenario3 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,6,7,7,8,4,5};
        int sum = 0;
        for(int i = 0; i< arr.length;i++){
            sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);
    }
}
