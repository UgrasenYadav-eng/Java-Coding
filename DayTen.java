import java.util.Scanner;

public class DayTen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name here");
        // statment to take String input
        String name = sc.nextLine();
        
        System.out.println(name);
        // closing Scanner class  
        sc.close();
    }
}