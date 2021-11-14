package Practicum9.prak9;

import java.util.Scanner;

class Node { 
    private int data; 
    
    Node(int key) {
    data = key;
    }

    public int getKey() { 
        return data;
    }

    public void setKey(int id) { 
        data = id;
    }
}

class Heap {

    private Node[] heapArray; 
    private int maxSize; 
    private int currentSize;

    public Heap(int size) { 
        maxSize = size; 
        currentSize = 0;
        heapArray = new Node[size];
    }

    public void insertAt(int index, Node newNode) {    
        heapArray[index] = newNode;
    }

    public void trickleDown(int index) {   
        int largerChild;    
        Node top = heapArray[index]; 
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1; 
            int rightChild = leftChild + 1;

            if (rightChild < currentSize && heapArray[leftChild].getKey()
                    < heapArray[rightChild].getKey()){
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }
            
            if (top.getKey() >= heapArray[largerChild].getKey()){
                break;
            }

        heapArray[index] = heapArray[largerChild];
        index = largerChild;
    }
    heapArray[index] = top;
    }	
    
    public Node remove() {
        Node root = heapArray[0]; 
        heapArray[0] =heapArray[--currentSize]; 
        trickleDown(0);
        return root;
    }	

    public void displayHeap() {     
        int nBlanks = 32;
        int itemsPerRow = 1; 
        int column = 0;
        int j = 0;
        String dots = "...............................";
        System.out.println(dots + dots); 
        while (currentSize > 0) {
            if (column == 0) {
                for (int k = 0; k < nBlanks; k++) { 
                    System.out.print(' ');
                }
            }
        System.out.print(heapArray[j].getKey()); 
        if (++j == currentSize) {
            break;
        }
        if (++column == itemsPerRow) {
            nBlanks /= 2;
            itemsPerRow *= 2;
            column = 0; 
            System.out.println();
        } else {
            for (int k = 0; k < nBlanks * 2 - 2; k++) { 
                System.out.print(' ');
            }
        }
        }
        System.out.println("\n" + dots + dots);
    }

    public void displayArray() {
        for (int j = 0; j < maxSize; j++) { 
            System.out.print(heapArray[j].getKey() + " ");            
        }
        System.out.println("");
    }
    
    public void HeapSort(){
        //Ubah posisi index
        for(int j = maxSize/2-1;j>=0;j--){
            trickleDown(j);
        }
        
        System.out.println("Random Index: ");
        displayArray();
        displayHeap();
        
         for(int j= maxSize-1;j >=0 ;j--){
            Node bigNode = remove();
            insertAt(j, bigNode);
        }
    }
    
    public void incrementSize(){
        currentSize++;
    }
}

public class HeapSortApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, j;
        System.out.println("Enter size of item: ");
        size = input.nextInt();
        Heap HA = new Heap(size);
    
    
        for(j = 0; j < size; j++){
        int random = (int) (Math.random()*100);
        Node newNode = new Node(random);
        HA.insertAt(j, newNode);
        HA.incrementSize();
        }
    
        System.out.println("Random Data: ");
        HA.displayArray();
        
        HA.HeapSort();
        
        System.out.println("Sorted: ");
        HA.displayArray();
}
}
