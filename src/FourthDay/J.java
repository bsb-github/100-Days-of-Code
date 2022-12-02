package FourthDay;

import java.util.Objects;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;

        System.out.print("Enter a String: ");
        str = sc.next();

        StringBuffer buf =  new StringBuffer(str);

        String original = String.valueOf(buf);
        String reverse = String.valueOf(buf.reverse());

        if(Objects.equals(reverse, original)){ // Objects.equal() --> compares two objects and return true if they are equal else return false
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}
