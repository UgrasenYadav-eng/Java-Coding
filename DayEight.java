import java.util.Scanner;
public class DayEight {

    public static void printFactorial(int a){
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;            
        }
        System.out.println(factorial);
    }
    //main function start from here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printFactorial(a);

       sc.close();
    }
}