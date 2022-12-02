package FifthDay;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt(); // 0 ->
        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println("Cannot Divide by 0");
        }
        System.out.println("after CAtch");
        System.out.println(3+3);

    }
}
