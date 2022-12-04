package SeventhDays;

import java.util.Random;

public class Recursion {

    public static void main(String[] args) {
        // function calls itself in its body
        int n = 5;
        long factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial(5));
    }
    public static int giveOddRandomNumber(){
        // odd%2 != 0
        Random random = new Random();
        int rand = random.nextInt(100);

        if(rand%2 == 0){
          return giveOddRandomNumber();
        }else{
            return rand;
        }
    }
    public static long factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
