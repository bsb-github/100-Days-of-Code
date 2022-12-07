package NinthDay;

import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of students: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        int average = sum/n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(numbers[i] > average){
                count++;
            }
        }
        System.out.println("Numbers above average are "+count);
    }
}
