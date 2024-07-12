import java.util.Scanner;
public class DayEight {

    public static int greaterOfTwo(int a, int b){
        // function for checking which one is greater in both the given nembers
        if (a > b) {return a;            
        }
        else{return b;}
    }
    //main function will start from here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two input nembers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Greater = greaterOfTwo(a, b);
        System.out.println(Greater + " is the greater of these two inputs");
    }
}