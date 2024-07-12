import java.util.Scanner;
public class DayEight {

    public static int addingOddNums(int n){
        int odd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                odd = odd + i;    // Adding the return values and assigning that value in odd predefined variable             
            }
        }
        return odd;        
        }
        
    //main function start from here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number ;");
        int n = sc.nextInt();
        
        int odd= addingOddNums(n);
        System.out.println("Addition of 0 to all odds numbers are :" + odd);

       sc.close();
    }
}