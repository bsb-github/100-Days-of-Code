package FifteenthDay;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
       int sum = sumArray(arr);
       System.out.println("Sum is "+sum);
       System.out.println(average(2, 3));
       print("Hello World");
    }

    public static int sumArray(int[] Arr) {
        int sum = 0;
        for (int i = 0; i < Arr.length; i++) {
            sum = sum + Arr[i];
        }
        return sum;

    }
    public static int average(int n1, int n2){
        return (n1+n2)/2;
    }
    // Parameters depends on what are you will do in method
    public static void print(String message){
        System.out.println(message);
    }
    
}
