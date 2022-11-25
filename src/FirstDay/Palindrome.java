package FirstDay;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number plzz! ");
        int num = s.nextInt();
        boolean a = true;
        for (int i = 2; i <= num-1; i++) { //
            if(num%i==0){
                a=false;
            }
        }

        if(a){
            System.out.println("It is Prime");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}
