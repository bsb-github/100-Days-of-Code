package FirstDay;
import java.util.Random;
import java.util.Scanner;

public class EncryptNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomKey = getOddRandom();
        System.out.println(randomKey);
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        name = sc.next();
        char alpha;
        StringBuilder Encrypted = new StringBuilder("");
        for (int i = 0; i <name.length() ; i++) {
            alpha = (char)(name.charAt(i)+randomKey);
            char a = name.charAt(i);
            if(alpha >90){
                Encrypted = new StringBuilder(Encrypted.append((char)(65 +i + randomKey)));
            }else{
                Encrypted = new StringBuilder(Encrypted.append( alpha));
            }
        }
        System.out.println(Encrypted);
    }
    public  static  int getEvenRandom(){
        Random random = new Random();
        int number = random.nextInt(25);
        if(number%2 == 0){
            return number;
        }else{
            return getEvenRandom();
        }
    }
    public  static  int getOddRandom(){
        Random random = new Random();
        int number = random.nextInt(25);
        if(number%2 != 0){
            return number;
        }else{
            return getOddRandom();
        }
    }

}
