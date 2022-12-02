package FirstDay;

import java.util.Random;
import java.util.Scanner;

public class Scenario {
    public static void main(String[] args) {
        /*
       agr jail se chor bhaag giya to police dismised agr ni bhaga to n dismisssed
       q k is m condiion h na ye wala theek h?
        * */
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(100);
        System.out.println(a);
        if (a < 50) {
            System.out.println("theif is not escape");

        } else {
            System.out.println("my speed is ot slow pcis ");
        }

    }
}