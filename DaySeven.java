public class DaySeven {

    public static void main(String[] args) {
        int u = 5;
        for (int i = 1; i <=u; i++) {
            //1st half start from here
            for (int j = 0; j <= u-i; j++) {
                System.out.print("  ");
                
            }
            
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");                
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(" *");                
            }        
            System.out.println();     
            //1st half ok and done.

            // 2nd half   
            
            }
            for (int i = 0; i <= u; i++) {
                for (int j = 0; j <=i; j++) {
                    System.out.print("  ");
                    
                }
                for (int j = 0; j < u-i; j++) {
                    System.out.print(" *");                    
                }
                for (int j = 1; j < u-i; j++) {
                    System.out.print(" *");                    
                }
                System.out.println();
                    
                }
        
            
        }
    }
