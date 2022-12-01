package FourthDay;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[1][6];
        // [2][4]
        //int[][] arr1 ={{12, 13, 34, 67}}; //[0][0] [0][1] [0][2] [1][0]
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(arr.length);
        // Rows
        for (int i = 0; i < arr.length ; i++) {
            // Columns
            for (int j = 0; j < 6; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
