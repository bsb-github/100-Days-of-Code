package FirstDay;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number plzz! ");
        int num = s.nextInt();
        //o brackt k bd he to likha
        boolean a =(true);
for(int i = 2; i<num; i++){
    if(num % i ==0){
        a= false;
    }

}
if(a){
    System.out.println("this is a prime number");
}
else{
    System.out.println("Not a prime number");
}
    }
}