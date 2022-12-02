package FifthDay;

public class TwoDArray {
    public static void main(String[] args) {
        //int[][] arr =  new int[3][4]; -> best for taking input from user
        // arr.length -> length of row
        // arr[0].length -> length of column
        // array index starts with 0
        int[][] arr = {
                {10, 20 ,40, 50},
                {34, 56, 77, 76},
                {32, 43, 34, 21}
        }; // best for giving values by yourself

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
