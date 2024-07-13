/* public class DayNine {
    public static void main(String args[]){
        int marks [] =new int[3];
        // int [] marks = new int[3];
         marks [0]= 97;
         marks [1]= 98;
         marks [2]= 92;

     /*  System.out.println(marks[0]);
        System.out.println(marks[0]);
        System.out.println(marks[0]);
    */
                    // OR
/*    
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);            
        }           
    }

    
}
*/

/*
public class DayNine{
    public static void main(String[] args) {
        int marks [] = {97, 98, 92};

        for (int i = 0; i < 3; i++) {
            System.out.println(marks [i] + ",");
            
        }
    }
}  */

import java.util.*;
public class DayNine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number [] = new int [size];

        //Input

        for (int i = 0; i < size; i++) {
            number [i] = sc.nextInt();            
        }

        int u = sc.nextInt(); // this will be the value which we have to search from the array.

        // Output

        for (int i = 0; i < size; i++) {
            if ( number [i] == u) {
                System.out.println( " u is founded in the index: " + i );
            }           
        }

    }
}