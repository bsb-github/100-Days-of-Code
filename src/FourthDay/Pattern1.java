package FourthDay;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int k = i; k <=5 ; k++) { // i=1 =>  1 2 3 4 5; i=2 => 2 3 4 5 ; i=3 => 3 4 5 ; i=4 => 4 5 i=5 5
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) { // i=1 => * ; i=2 => * * ;i=3 => * * * ; i=4 =>  * * * * ; i=5 => * * * * *

                System.out.print("* ");
            }
            System.out.println(); // next line
        }
    }
}
