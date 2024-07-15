public class DayEleven {
    public static void main(String[] args) {
        int a = 5;
        int pos = 2;
        int bitMask= 1<<pos;
      
      int Not = ~(bitMask) & a;
      int Prakriti = Not ;
        System.out.println(Prakriti);            
        
    }
}
