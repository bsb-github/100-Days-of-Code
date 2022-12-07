package SeventhDays;

import java.util.Scanner;

public class PalindormeWithMethods {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length() -1 ; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            return true;
        }else{
            return false;
        }

    }

}
