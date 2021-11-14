package Practicum6;

/**
 *
 * @author -ACER-
 */
class shellsort {
    private int[] arr; 
    private int nElemen;
    
    public shellsort(int max) {
        arr = new int[max]; 
        nElemen = 0; 
    }
    
    public void insert(int value) {
        arr[nElemen] = value; 
        nElemen++; 
    }

    public void display(){ 
        for(int i=0; i<nElemen; i++){ 
            System.out.print(arr[i] + " "); 
            }
            System.out.println("");
            }
    
    public void shellSort(){
        int in, out;
        int temp;
        int h = 0;
        h = 3 * h + 1;
        while(h>0) {
            for(out=h; out<nElemen; out++){
                temp =  arr[out];
                in = out;
        while(in > h-1 && arr[in-h] >= temp){
            arr[in] = arr[in-h];
            in -= h;
        }
            arr[in] = temp;
            for (int a=0; a<nElemen;a++){
                    System.out.print(arr[a] + " ");
            }
            System.out.println();
                }
        
            h  /= 2;
    } 
    }
    
}


class TestoApp {
    public static void main(String[] args){
    int maxSize = 8; 
    shellsort arr;
    arr = new shellsort(maxSize);
    arr.insert(40);
    arr.insert(20);
    arr.insert(50);
    arr.insert(80);
    arr.insert(10);
    arr.insert(60);
    arr.insert(30);
    arr.insert(70);
   
    arr.shellSort();
    } 
}
//40,20,50,80,10,60,30,70

//10 20 50 80 40 60 30 70 
//10 20 50 80 40 60 30 70 
//10 20 30 80 40 60 50 70 
//10 20 30 70 40 60 50 80 
//10 20 30 70 40 60 50 80 
//10 20 30 70 40 60 50 80 
//10 20 30 70 40 60 50 80 
//10 20 30 60 40 70 50 80 
//10 20 30 60 40 70 50 80 
//10 20 30 60 40 70 50 80 
//10 20 30 60 40 70 50 80 
//10 20 30 60 40 70 50 80 
//10 20 30 60 40 70 50 80 
//10 20 30 40 60 70 50 80 
//10 20 30 40 60 70 50 80 
//10 20 30 40 50 60 70 80 
//10 20 30 40 50 60 70 80 
