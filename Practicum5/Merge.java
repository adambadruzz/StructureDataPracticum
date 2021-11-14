package Practicum5;

class Arrays {
    private int arr[];
    private int nElemen;

    public Arrays(int size) {
        arr = new int[size];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }
    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void mergeSort() {
        int[] workSpace = new int[nElemen];
        recMergeSort(workSpace, 0, nElemen - 1);
    } 
    public void recMergeSort(int[] workSpace, int lowerBound, int upperBound) { 
    if (lowerBound == upperBound) { 
      return; 
    } else { 
      int mid = (lowerBound + upperBound) / 2; 
      recMergeSort(workSpace, lowerBound, mid); 
      recMergeSort(workSpace, mid + 1, upperBound); 
      merge(workSpace, lowerBound, mid + 1, upperBound); 
  } 
}   
    
    public void merge(int[] workSpace,  
    int lowIndex, int highIndex, 
    int upperBound) { 
    int j = 0; 
    int lowerBound = lowIndex; 
    int mid = highIndex - 1; 
    int nItem = upperBound - lowerBound + 1; 
 
  while (lowIndex <= mid && highIndex <= upperBound) {
    if (arr[lowIndex] < arr[highIndex]) { 
       workSpace[j++] = arr[lowIndex++]; 
     } else { 
       workSpace[j++] = arr[highIndex++]; 
     } 
  } 

  while (lowIndex <= mid) { 
    workSpace[j++] = arr[lowIndex++]; 
  } 
 
  while (highIndex <= upperBound) { 
    workSpace[j++] = arr[highIndex++]; 
  } 
 
  for (j = 0; j < nItem; j++) { 
    arr[lowerBound + j] = workSpace[j]; 
         } 
    } 
}//akhir class Arrays 

public class Merge{
    public static void main(String[] args) {
        int maxSize=10;
        Arrays arr;
        arr = new Arrays(maxSize);
        arr.insert(90);
        arr.insert(29);
        arr.insert(30);
        arr.insert(50);
        arr.insert(23);
        arr.insert(80);
        arr.insert(45);
        arr.insert(75);
        arr.insert(10);
        arr.insert(5);
        System.out.println("Sebelum di Merge");
        arr.display();
        
        arr.mergeSort();
        System.out.println("Sesudah di Merge");
        arr.display();
    }
}
