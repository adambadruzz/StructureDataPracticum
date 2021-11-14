package Practicum5;
public class RekursifApp {
    
public static int pangkatRekursi(int base, int exponent) {
      if (exponent == 0) {
         return 1;
      }
      else {
         return base * pangkatRekursi (base, exponent - 1);
      }
   }
   public static void main(String[] args) {
       System.out.println("2^10 = "+pangkatRekursi(2,10));
       System.out.println("3^5 = "+pangkatRekursi(3,5));
       System.out.println("3^16 = "+pangkatRekursi(3,16));
   }
}
