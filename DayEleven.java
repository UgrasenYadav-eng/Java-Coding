public class DayEleven {
    public static void main(String[] args) {
        int a = 5;
        int pos = 2;
        int bitMask= 1<<pos;
        if ((bitMask & a) == 0) {
            System.out.println("Bit was 0");            
        }
        else{ System.out.println("Bit was 1");}
    }
    
}
