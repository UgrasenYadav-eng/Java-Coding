public class DaySeven {
    public static void main(String[] args) {
        int u = 4;
        for (int i = 0; i <= u; i++) {
            for (int j = 1; j <=i; j++){
                int sum =i+j;
                if (sum % 2== 0) {
                    System.out.print("1");
                }
                    else {
                        System.out.print("0");
                    }              
            }
            System.out.println();
        }
    }
    
}