 
//program to add n natural numbers
import java.util.*;
public class DayFive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        /*       
        for (int i=1; i<=10; i++) {
           
            System.out.print(n); 
            System.out.print("*");
            System.out.print(i);
            System.out.print("=");
            System.out.println(n*i);     //Adding 0+i        
        } */
       /*Add n natural numbers */
       /* 
       int sum = 0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println(sum);
        */
        int sum = 1;
        for(int i=1; i<=n; i++){
            sum=sum*i;
            
        }
        System.out.print("fattoril of " + n +" is = ");
        System.out.println(sum);

    }
}
