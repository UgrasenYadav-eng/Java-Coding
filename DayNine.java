import java.util.*;
public class DayNine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fristName = "Ugrsen";
        String lastName = "Yadav";
        String fullName = fristName + " " + lastName;

        /* printing lenght of the string in this manner:- 
         * U
         * g
         * r
         * a
         * s
         * e
         * n 
         * Y
         * a
         * d
         * a
         * v
         */

        for (int i = 0; i < fullName.length(); i++) {

        System.out.println(fullName.charAt(i));
        }
    }
}