
import java.util.Scanner;

public class DaySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = 4;
        //outer loop to print column
        for (int i=0; i<n; i++){
            for (int j = 2; j <=n-i; j++) { 
                    System.out.print(" ");             
            }
            for (int j = 0; j<=i; j++) {
                System.out.print("*");             
                
            }

            System.out.println();
        }
        sc.close();
    }
    
}