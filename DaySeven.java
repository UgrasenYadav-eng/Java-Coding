public class DaySeven {

    public static void main(String[] args) {
        int u = 5;
        for (int i = 1; i <=u; i++) {
            for (int j = 0; j <= u-i; j++) {
                System.out.print("  ");
                
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j+" ");                
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j+" ");                
            }
            System.out.println();
            
        }
    }
}