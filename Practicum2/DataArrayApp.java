package Practicum2;

import java.util.Scanner;

public class DataArrayApp {
    public static void main(String[] args){
        int maxSize = 100;
        DataArray arr;
        Scanner input = new Scanner(System.in);  
        arr = new DataArray(maxSize);
        System.out.println("Input kata :");  

        String s = input.nextLine(); 
        System.out.println("Data yang di-input-kan adalah " + s);
        

        char[] mhs = s.toCharArray();


        arr.displayArray();
        
        System.out.println("");
        System.out.println("Sorting :");
        arr.SelectionSortName();
        arr.displayArray();
    }
}
