package TenthDay;

import java.util.Scanner;

public class LabTask1 {
    static Scanner sc = new Scanner(System.in);
    static int excellent = 0;
    static int average = 0;
    static int bad = 0;
    public static void main(String[] args) {

        summarizePoll();
    }
    static void getResponses(){
        int[] responses = new int[10];
        for (int i = 0; i < responses.length; i++) {
            System.out.println("Roll no " +(i+1) + " Rate Cafeteria Food out of 10: ");
            responses[i] = sc.nextInt();
            if(responses[i]>10){
                excellent++;
            } else if (responses[i]>=7) {
                excellent++;
            } else if (responses[i]>=4) {
                average++;
            }else{
                bad++;
            }
        }
    }
    static void summarizePoll(){
        getResponses();
       double excellentInputs = ((double)excellent/10) * 100;
        double averageInputs = ((double)average/10) * 100;
        double badInputs = ((double)bad/10) * 100;

        System.out.println("Percentage of Excellent Inputs: "+excellentInputs);
        System.out.println("Percentage of Average Inputs: "+averageInputs);
        System.out.println("Percentage of bad Inputs: "+badInputs);

    }
}
