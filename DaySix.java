
import java.util.Scanner;

public class DaySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        for (int i=0; i<=m-1; i++){
            for (int j = 1; j <=i; j++) { 
                    System.out.print("*");             
            }
            System.out.println("*");
        }
        sc.close();
    }
    
}