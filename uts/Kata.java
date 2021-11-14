//
//package uts;
//
//import java.util.Scanner;
//
///**
// *
// * @author -ACER-
// */
//public class Kata {
//    private String huruf;
//    
//    public Kata (String huruf){
//        this.huruf = huruf;
//    }
//    
//    public void displayMhs(){
//    System.out.print(huruf);
//    }
//    
//    public String gethuruf(){
//        return huruf;
//    }
//}
//
//class DataArray{
//    private Kata[] hrf;
//    private int nElemen;
//    
//    public DataArray(int max){
//        hrf = new Kata[max];
//        nElemen = 0;
//    }
//    
//    public void insert(String huruf){
//        hrf[nElemen] = new Kata(huruf);
//        nElemen++;
//    }
//    
//    public void displayArray(){
//        for(int i = 0; i<nElemen; i++){
//        hrf[i].displayMhs();
//    }
//    }
//    
//    public void SelectionSortNama() { 
//   int awal, i, min; 
//   for (awal=0; awal< nElemen-1; awal++) { 
//      min = awal; 
//      for (i = awal + 1; i < nElemen; i++) { 
//           if (hrf[i].gethuruf().compareTo(hrf[min].gethuruf())<0) { 
//                min = i; 
//           } 
//      } 
//      swap(awal, min);
//  } 
//}
//        
//    public void swap(int one, int two){
//        Kata temp = hrf[one];
//        hrf[one] = hrf[two];
//        hrf[two] = temp;
//}
//}
//
//class DataArrayApp{
//    public static void main(String[]args){
//        int maxSize = 100;
//        DataArray arr;
//        arr = new DataArray(maxSize);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input kata: ");
//        
//        String kata= input.next();
//        
//        for (int i = 0; i < kata.length(); i++) {
//            String huruf = String.valueOf(kata.charAt(i));
//            arr.insert(huruf);
//        }
//        
//        System.out.println("kata sebelum diurutkan : \n"+kata);
//        
//        arr.SelectionSortNama();
//        System.out.println("alfagram adalah : ");
//        arr.displayArray();
//        System.out.println("");
//    }
//}