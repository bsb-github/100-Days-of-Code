package FifteenthDay;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static String[] moves = {"rock","paper", "scissors"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
              String computerMove = computerMove();
              System.out.print("Play your move: ");
              String playerMove = sc.next().toLowerCase();
              showResult(computerMove, playerMove); 
        }
     


        
    }
    public static String computerMove() {
        Random random =  new Random();
        return moves[random.nextInt(moves.length)];
        
    }
    public static void showResult(String cm, String pm) {
        int searchResult = Arrays.binarySearch(moves, pm);
        if(searchResult > -1 ){
        if(cm.equals(pm)){
            System.out.println("Tied");
        }
        if(cm.equals(moves[0]) && pm.equals(moves[1])){
            System.out.println("You Win");
        }else if(cm.equals(moves[1]) && pm.equals(moves[0])){
            System.out.println("Computer Win");
        }
        if(cm.equals(moves[1]) && pm.equals(moves[2])){
            System.out.println("You Win");
        }else if(cm.equals(moves[2]) && pm.equals(moves[1])){
            System.out.println("Computer Win");
        }
        if(cm.equals(moves[0]) && pm.equals(moves[2])){
            System.out.println("You Win");
        }else if(cm.equals(moves[2]) && pm.equals(moves[1])){
            System.out.println("Computer Win");
        }
        }else{
            System.out.println("Invalid Move");
        }
    }
    
}
