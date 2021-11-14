package Practicum2;
import java.util.Arrays;

class HighArray{
    private int[] arr;
    private int nElemen=0;
    
    public HighArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    
    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

//0)8,5,6,10,9,3//1)


    public void BubbleSortAsc() { 
    int batas, i; //i 3 b 5
    
        for (batas = nElemen-1; batas>0; batas--) { 
            
        for (i = 0; i < batas; i++) { 
           
        if (arr[i] > arr[i + 1]) { 
            
            swap(i, i + 1); 
            display();
        }  
     } 
  } 
} 
    public void BubbleSortDesc() { 
    int batas, i; //i 0 b 5 0 > 1
        for (batas = nElemen-1; batas>0; batas--) { 
        for (i = 0; i < batas; i++) { 
        if (arr[i] < arr[i + 1]) { 
            swap(i, i + 1); 
        }  
    } 
  } 
} 
//awal = 0 < 5
//min = 5
//i 2
//749352//
//i 5 < m 3
//
   public void SelectionSort() { 
   int awal, i, min; 
   for (awal=0; awal< nElemen-1; awal++) { 
      min = awal; 
      for (i = awal + 1; i < nElemen; i++) { 
           if (arr[i] < arr[min]) { 
                min = i; 
           } 
      } 
      swap(awal, min);
      display();
   } 
}
   
       public void swap(int one, int two) { 
    int temp = arr[one]; 
    arr[one] = arr[two]; 
    arr[two] = temp; 
}
   public void InsertionSort() { 
  int i, curIn; 
  for (curIn= 1; curIn < nElemen; curIn++) { 
      int temp = arr[curIn]; 
      //temp = arr[2]
      //i = 2
      //arr 1 >= arr [2]
      i = curIn;
      while (i > 0 && arr[i - 1] >= temp) { 
            arr[i] = arr[i - 1]; 
            display();
            i--; 
      } 
      arr[i] = temp; 
      display();
   } 
} 
            
    public void display(){
        for(int i=0;i<nElemen;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
       public int size(){
        int ArrSize = nElemen;
        return ArrSize;
    }
       
  }

public class HighArrayApp {
    public static void main(String[]args){
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        
//        System.out.println("Bubble Sort");
//        System.out.println("Sebelum Diurutkan :");
//        arr.display();
//        System.out.println("");
//        arr.BubbleSortAsc();
//        System.out.println("Setelah Diurutkan :");
//        arr.display();      
//        System.out.println("");
        
            System.out.println("Bubble Sort");
            System.out.println("Sebelum Diurutkan :");
            arr.display();
            arr.BubbleSortDesc();
            System.out.println("Setelah Diurutkan :");
            arr.display();      
            System.out.println("");
        
//        System.out.println("Selection Sort");
//        System.out.println("Sebelum Diurutkan :");
//        arr.display();
//        System.out.println("");
//        arr.SelectionSort();
//        System.out.println("Setelah Diurutkan :");
//        arr.display();  
//        System.out.println("");
//        
//        System.out.println("Insertion Sort");
//        System.out.println("Sebelum Diurutkan :");
//        arr.display();
//        System.out.println("");
//        arr.InsertionSort();
//        System.out.println("");
//        System.out.println("Setelah Diurutkan :");
//        arr.display();  
//            System.out.println("Jumlah elemen : "+arr.size()); 
    }
}
