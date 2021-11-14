package Practicum9;

//package temu9;
//
//class Node { 
//    private int data; 
//    
//    Node(int key) {
//    data = key;
//    }
//
//    public int getKey() { 
//        return data;
//    }
//
//    public void setKey(int id) { 
//        data = id;
//    }
//}
//
//class Heap {
//
//    private Node[] heapArray; 
//    private int maxSize; 
//    private int currentSize;
//    private int last;
//
//    public Heap(int size) { 
//        maxSize = size; 
//        currentSize = 0;
//        heapArray = new Node[size];
//        last=0;
//    }
//
//    public boolean insertAt(int index, int value) {    
//    Node newNode = new Node(value); 
//    heapArray[currentSize] = newNode; 
//    trickleUp(currentSize++);
//    last++;
//    return true;
//    }
//
//    public void trickleUp(int index) { 
//        int parent = (index - 1) / 2; 
//        Node bottom = heapArray[index];
//
//        while (index > 0 && heapArray[parent].getKey() < bottom.getKey()) {
//            heapArray[index] = heapArray[parent]; 
//            index = parent;
//            parent = (parent - 1) / 2;
//        }
//        heapArray[index] = bottom;
//    }
//
//    public Node remove() {
//        Node root = heapArray[0]; 
//        heapArray[0] =heapArray[--currentSize]; 
//        trickleDown(0);
//        return root;
//    }	
//
//    public void trickleDown(int index) {   
//        int largerChild;    
//        Node top = heapArray[index]; 
//        while (index < currentSize / 2) {
//            int leftChild = 2 * index + 1; 
//            int rightChild = leftChild + 1;
//
//            if (rightChild < currentSize && heapArray[leftChild].getKey()< heapArray[rightChild].getKey()){
//                largerChild = rightChild;
//            } else {
//                largerChild = leftChild;
//            }
//            
//            if (top.getKey() >= heapArray[largerChild].getKey()){
//                break;
//            }
//
//        heapArray[index] = heapArray[largerChild];
//        index = largerChild;
//    }
//    heapArray[index] = top;
//    }	
//
//    public void displayHeap() { 
//        System.out.println("Heap Array (Sebelum urut) : ");
//        for (int i = 0; i < currentSize; i++) { 
//            if (heapArray[i] != null) {
//                System.out.print(heapArray[i].getKey() + " ");
//            } else {
//                System.out.println("--");
//            }
//        }
//        System.out.println("");     
//        int nBlanks = 32;
//        int itemsPerRow = 1; 
//        int column = 0;
//        int j = 0;
//        String dots = ".	";
//        System.out.println(dots + dots); 
//        while (currentSize > 0) {
//            if (column == 0) {
//                for (int k = 0; k < nBlanks; k++) { 
//                    System.out.print(' ');
//                }
//            }
//        System.out.print(heapArray[j].getKey()); 
//        if (++j == currentSize) {
//            break;
//        }
//        if (++column == itemsPerRow) {
//            nBlanks /= 2;
//            itemsPerRow *= 2;
//            column = 0; 
//            System.out.println();
//        } else {
//            for (int k = 0; k < nBlanks * 2 - 2; k++) { 
//                System.out.print(' ');
//            }
//        }
//        }
//        System.out.println("\n" + dots + dots);
//    }
//
//    public void displayArray() {
//        for (int j = 0; j < last; j++) { 
//            if(heapArray[j] !=null){
//                   System.out.print(heapArray[j].getKey() + " "); 
//            }
//        }
//        System.out.println("");
//    }
//    
//    public void heapsorting(){
//        System.out.println("Sorted Array: ");
//        for (int i = last-1; i>=0; i--){
//            for (int j=last/2-1; j>=0; j--){//membuat array menjadi random pada tumpukan
//                trickleDown(j);
//            }
//            Node remove = this.remove();//menghapus data(heap) dan ditampung pada last array
//            heapArray[i]=remove;
//        }
//    }
//} //akhir class Heap
//
//public class HeapSortApp{
//    public static void main (String [] args){
//        Heap HT = new Heap(35);
//        HT.insertAt(0,45);
//        HT.insertAt(1,95);
//        HT.insertAt(2,35);
//        HT.insertAt(3,65);
//        HT.insertAt(4,25);
//        HT.insertAt(5,55);
//        HT.insertAt(6,75);
//        HT.insertAt(7,15);
//        HT.insertAt(8,125);
//        HT.insertAt(9,115);
//        HT.insertAt(10,85);
//        HT.insertAt(11,105);
//        
//        HT.displayHeap();
//        System.out.println(" ");
//        HT.heapsorting();
//        HT.displayArray();
//        
//        HT.displayHeap();
//    }
//}