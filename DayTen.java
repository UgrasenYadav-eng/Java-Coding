import java.util.Scanner;

public class DayTen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking 1st input
        System.out.println("enter the name 1");
        String name1 = sc.nextLine();

         // taking 2nd input
        System.out.println("enter the name 2");
        String name2 = sc.nextLine();
        
        // comparing the both names
        if (name1.compareTo(name2) == 0) {
            System.out.println("both nem are equals");            
        } else { System.out.println("numbers are not equals");}
        
        // closing Scanner class  
        sc.close();
    }
}