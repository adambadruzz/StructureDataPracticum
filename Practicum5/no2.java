package Practicum5;
class rumus{
    public int triangleIter(int n) {
    int result = 0;
    for (int i = n; i > 0; i--) {
        result += i;
    }
    return result;
} 
    
    public int triangleRecur (int n){
  if (n == 1) {
     return 1;
  } else {
     return n + triangleRecur(n - 1);
    }
  }
    
    public int triangleIterK(int n) {
    int result = 1;
    for (int i = n; i > 0; i--) {
        result = i*result;
    }
    return result;
} 
    
    public int triangleRecurK (int n){
  if (n == 1) {
     return 1;
  } else {
     return n * triangleRecurK(n - 1);
    }
  }
    
}
public class no2 {
    public static void main(String[] args) {
        rumus rms = new rumus();
        System.out.println("Hasil = "+rms.triangleIter(5));
        System.out.println("Hasil = "+rms.triangleRecurK(5));       
    }
}
