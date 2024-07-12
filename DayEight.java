import java.util.Scanner;
public class DayEight {

    public static int averageOfNum(int a, int b, int c){
        int avr = (a + b + c) / 3;
        return avr;        
        }
        
    //main function start from here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number ;");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        
        int avr= averageOfNum(a, b, c);
        System.out.println("the average is :" + avr);

       sc.close();
    }
}