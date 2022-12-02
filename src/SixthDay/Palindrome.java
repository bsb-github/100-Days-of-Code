package SixthDay;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String ");
        String string = sc.next();

        String reverse = "";

        for (int i = string.length() -1; i >=0 ; i--) {
            reverse = reverse + string.charAt(i);
        }

      if(string.equals(reverse)){
          System.out.println("Palindrome");
      }else{
          System.out.println("not a palindrome");
      }
    }
}
