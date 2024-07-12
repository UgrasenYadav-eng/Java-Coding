import java.util.Scanner;
public class DayEight {

    public static int mulOfTwoNum(int a, int b){
        int mul = a * b;
        return mul;
    }
    //main function start from here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // calling the function
        int mul = mulOfTwoNum(a, b);
        System.out.println("Multiplication of the two numbers are :" + mul);
    }
}