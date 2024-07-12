import java.util.Scanner;
public class DayEight {

    public static double  cricleCrecumfrance(double a ){
        // function for checking which one is greater in both the given nembers
        double cr = 2 * (3.14) * a;
        return cr;
    }
    //main function will start from here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input nember");
        double a = sc.nextInt();
        

        double cr = cricleCrecumfrance(a);
        System.out.println(cr + " is the Circumference of the circle");
    }
}