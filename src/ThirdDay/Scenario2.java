package ThirdDay;

public class Scenario2 {
    public static void main(String[] args) {
        String num1 = "10101";
        String num2 = "101";
        String num3 = "";
        StringBuilder sum = new StringBuilder();
        if(num1.length() > num2.length()){
            num3 = num2;
            while (num3.length()!=num1.length()){
                num3 = "0" + num3;
            }

        }else if(num2.length() > num1.length()){
            num3 = num1;
            while (num3.length()!=num2.length()){
                num3 = "0" + num3;
            }
        }
        String carry = "";
        for (int i = num1.length()-1; i > 0; i--) {
            if(num1.charAt(i) == '1' && num3.charAt(i) == '1'){
                if(carry.equals("1")){
                    sum.append("1"); // 1  carry -> 1;
                    continue;
                }else{
                    sum.append("0"); // 0 carry -> 1;
                    carry = "1";
                    continue;
                }

            }else if(num1.charAt(i) == '1' && num3.charAt(i) == '0'){
                if(carry.equals("1")){
                    sum.append("0"); // 0 carry -> 1
                    carry = "1";
                    continue;
                }else{
                    sum.append("1"); // 1
                    continue;
                }
            }else if(num1.charAt(i) == '0' && num3.charAt(i) == '1'){
                if(carry.equals("1")){
                    sum.append("0"); // 0 carry -> 1
                    carry = "1";
                    continue;
                }else{
                    sum.append("1"); // 1
                    continue;
                }
            }else{
                if(carry.equals("1")){
                    sum.append("1");
                    continue;
                }else{
                    sum.append("0");
                    continue;
                }
            }
        }
        System.out.println(sum);
    }
}
