

import java.util.*;
public class DayNine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        //2D array initilizing
        int [][]numbers = new int[rows] [cols];

        //input  
                      // row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j]=sc.nextInt();                
            }
        }
            System.out.print("Enter the number to search: ");
            int u = sc.nextInt();

            for (int i = 0; i<rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (numbers [i][j] == u){
                        System.out.println(" the index of the input: " + u + " is " + "(" + i + "," + j + ")");
                    }
                    
                }
                
            }
            sc.close();
        }
    

    }
