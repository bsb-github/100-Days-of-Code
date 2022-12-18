package FourteenthDay;

import java.util.Scanner;

public class CurrencyConverter {

   static String[] CURRENCIES_DATA = {"PKR", "USD", "EUR", "AED", "INR"};
   static double[] CURRENCIES_VALUE = {1.0, 224.48, 239.13, 61.12, 2.71};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("From:  ");
        String from = sc.next().toUpperCase();
        System.out.print("to:  ");
        String to = sc.next().toUpperCase();
        int indexOfFrom = getIndex(from);
        int indexOfTo = getIndex(to);
        System.out.print("Enter Ammount in "+ CURRENCIES_DATA[indexOfFrom]+" to Convert: ");
        if(indexOfFrom > -1 && indexOfTo > -1){
            double convertionResult =  convert(indexOfFrom, indexOfTo);
        }else{
            System.out.println("Data Doesn't Exist");
        }
        

    }
    public static double convert(int from, int to){
        double fromVal = CURRENCIES_VALUE[from];
        double toVal = CURRENCIES_VALUE[to];
        return 0.1;


    }
    // Searching the Entered Currencies in the Array to check whether it Exist or not if Exist Return the INDEX else return -1
    public static int getIndex(String currency){
        for (int i = 0; i < CURRENCIES_DATA.length; i++) {
            if(currency.equals(CURRENCIES_DATA[i])){
                return i;
            }
        }
        return -1;
    }

    
}
