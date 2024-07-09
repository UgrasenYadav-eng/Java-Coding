import java.util.Scanner;
public class DayFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    /*this line create the Scanner object named sc, 
                                                this is used to read the input from standard input stream (System.in)*/
        
        System.out.println("Dear user, Please Enter a number"); //taking input from user
        
        int n = sc.nextInt();   //input is intizer type and initlized in n variable

        for (int i=0; i < n; i++) {
            for (int j = 1;  j < n;  j++) {
                System.out.print("*");
                
            }
            System.out.println("*");
            
        }


        sc.close();
    }
}