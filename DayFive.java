import java.util.*;
public class DayFive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i=0; i<=n; i++) {
            sum=sum+i;     //Adding 0+i        
        }
        System.out.println(sum);

    }
}