public class DaySeven {

    public static void main(String[] args) {
        int u = 5;
        for (int i = 1; i <=u; i++) {
            for (int j = 0; j <=u-i; j++) {
                System.out.print("  ");
                
            }
            for (int j = 1; j <=u; j++) {
                System.out.print(" *");
                
            }
            System.out.println();
            
        }
    }
}