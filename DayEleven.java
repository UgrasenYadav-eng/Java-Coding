public class DayEleven {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask= 1<<pos;
        //ok
      
      int Not = ~(bitMask);
      int Prakriti = Not & n ;
        System.out.println(Prakriti);            
        
    }
}
