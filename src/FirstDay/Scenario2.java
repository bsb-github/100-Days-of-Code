package FirstDay;

import java.util.Scanner;

public class Scenario2 {
    public static void main(String[] args) {
        // bhooli v q k practice ni ki hbut pta h q kia hota
        //umber rstore karate na array m
        // collection of homogenious element 10 ghante to hang ara tha awaz mn to nhi aya
        // samjh lgi
        //kis cheez ka banau?
        String[] userName =  new String[10];
        userName = new String[]{"BSB", "Javeria"};
        String[] password =  {"dfgdf","sfsf"};
         Scanner s = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = s.next();
        System.out.println("Enter password: ");
        String passwordd = s.next(); //ab? na ye to if m ni hoga?
        int index = -1;
        for(int i = 0; i< userName.length; i++){
            if(userName[i].equals(username)){
                index = i;
            }
            //hn
        }

        if(index == -1){
            System.out.println("No account Exist");
        }else{
            if (password[index].equals(passwordd)) {
                System.out.println("Logged in");
            }
            else{
                System.out.println("Wrong Password");
            }
        }

    }
}
