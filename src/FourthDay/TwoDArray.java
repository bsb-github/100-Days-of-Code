package FourthDay;

import java.util.Random;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        Random rand = new Random();
        // [2][4]
        //int[][] arr1 ={{12, 13, 34, 67}}; //[0][0] [0][1] [0][2] [1][0]
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Length of Columns"+arr[0].length);
        // Rows
        for (int i = 0; i < arr.length ; i++) {
            // Columns
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
