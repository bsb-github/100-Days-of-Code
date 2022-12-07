package EigthDay;

import java.util.Scanner;

public class PalindromeAtATim {
    public static void main(String[] args) {
        String str;
        String reverse = "";
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a String: ");
        str = sc.next();
        reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
