public class DaySeven {
    public static void main(String[] args) {
        int u = 4;
        for (int i = 0; i < u; i++) {
            for (int j = 1; j <=u-i; j++){
                System.out.print(" ");              
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");                
            }
            System.out.println();
        }
    }
    
}
