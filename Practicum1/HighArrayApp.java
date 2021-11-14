package Practicum1;

import java.util.Arrays;

class HighArray{
    private int[] arr;
    private int nElemen;
    
    public HighArray(int max){
        arr = new int[max];
        nElemen=0;
    }
 
       public int insert(int value){
           int i;
           for (i = nElemen - 1;(i >= 0 && arr[i] > value);i--){
           arr[i + 1] = arr[i];
        }
           arr[i+1] = value;
           
           return nElemen++;
       }

      // |70| |75| |80| || 
      //  0    1    2    3    4   
//        arr.insert(70);
//        arr.insert(80);
//        arr.insert(75);
    
       
    public boolean find(int key){
        int BB = 0,BA = nElemen-1;
        boolean search = true;
        while(search){
        int mid = (BA+BB)/2;
        if(arr[mid]==key){
            search = false;
            return true;
        }else if (BB>BA){
            break;
        }else{
            if(arr[mid]<key){
                BB = mid + 1;
            }else{
                BA = mid - 1;
            }
          }
        }
        return false;
    }
    
    public boolean delete(int value){
        int i;
        for(i=0;i<nElemen;i++){
            if(value==arr[i]){
                break;
            }
        }
        if (i ==nElemen){
            return false;
        }else{
            for(int j=i;j<nElemen;j++){
                arr[j]=arr[j+1];
            }
            nElemen--;
            return true;
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
        int maxSize=100;
        HighArray arr;
        arr = new HighArray(maxSize);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(00);
        arr.insert(90);
        arr.insert(40);
        
        arr.display();
        System.out.println("Jumlah elemen : "+arr.size()); 
        
        int key = 90;
        
        if (arr.find(key)) {
            System.out.println(key + 
                      " ditemukan");
        } else {
            System.out.println(key + 
                      " tidak ditemukan");
        }
        
        arr.delete(00);
        arr.delete(80);
        arr.delete(55);
        
        System.out.println("");
        arr.display();
        System.out.println("Jumlah elemen : "+arr.size());        
    }
}
