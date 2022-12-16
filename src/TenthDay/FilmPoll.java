package TenthDay;

import java.util.Arrays;
import java.util.Scanner;

public class FilmPoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rating  = new int[5];
        for (int i = 0; i < 20; i++) {
            int input = sc.nextInt();
            rating[input-1]++;
        }
        System.out.println(Arrays.toString(rating));
    }
}
