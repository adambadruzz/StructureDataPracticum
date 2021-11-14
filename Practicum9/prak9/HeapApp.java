package Practicum9.prak9;

//
//package temu9.newpackage;
//
// class Node {
//
//    private int data;
//
//    public Node(int key) {
//        data = key;
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
//
//    public Heap(int size) {
//        maxSize = size;
//        currentSize = 0;
//        heapArray = new Node[size];
//    }
//
//    public boolean isEmpty() {
//        return currentSize == 0;
//    }
//public boolean insert(int key) { 
//        if (currentSize == maxSize) {
//            return false;
//    }    
//    Node newNode = new Node(key); 
//    heapArray[currentSize] = newNode; 
//    trickleUp(currentSize++);
//    return true;
//    }
//
//public boolean change(int index, int newVal) {
//        if(index<0 || index>=currentSize)
//            return false;
//        
//            int oldVal = heapArray[index].getKey(); 
//            heapArray[index].setKey(newVal); 
//            if(oldVal < newVal) 
//                trickleUp(index); 
//            else 
//                trickleDown(index); 
//                return true;
//    }
//
//    public void trickleUp(int index) {
//        int parent = (index - 1) / 2;
//        Node bottom = heapArray[index];
//
//        while (index > 0 && heapArray[parent].getKey()<bottom.getKey()) {
//            heapArray[index] = heapArray[parent];
//            index = parent;
//            parent = (parent - 1) / 2;
//        }
//        heapArray[index] = bottom;
//    }
//    public Node remove() {
//        Node root = heapArray[0];
//        heapArray[0] = heapArray[--currentSize];
//        trickleDown(0);
//        return root;
//    }
//
//public void trickleDown(int index) {
//        int largerChild;
//        Node top = heapArray[index];
//        while (index < currentSize / 2) {
//           int leftChild = 2 * index + 1;
//           int rightChild = leftChild + 1;
//
//           if (rightChild < currentSize &&
//            heapArray[leftChild].getKey()< heapArray[rightChild].getKey())
//            {
//                largerChild = rightChild;
//            } else {
//                largerChild = leftChild;
//            }
//
//           if(top.getKey() >=  heapArray[largerChild].getKey())
//                   {
//                break;
//            }
//
//           heapArray[index] =  heapArray[largerChild];
//           index = largerChild;
//        }
//
//        heapArray[index] = top;
//    }
//    
//    public void displayHeap() {
//        System.out.println("Heap Array: ");
//        for (int i = 0; i < currentSize; i++) {
//            if (heapArray[i] != null) {
//                System.out.print(heapArray[i].getKey() + " ");
//            } else {
//                System.out.println("--");
//            }
//        }
//        System.out.println("");
//        
//        int nBlanks = 35;
//        int itemsPerRow = 1;
//        int column = 0;
//        int j = 0;
//        String dots = "...............................";
//        System.out.println(dots + dots);
//        while (currentSize > 0) {
//            if (column == 0) {
//                for (int k = 0; k < nBlanks; k++) {
//                    System.out.print(' ');
//                }
//            }
//            
//            System.out.print(heapArray[j].getKey());
//            
//            if (++j == currentSize) {
//                break;
//            }
//            
//            if (++column == itemsPerRow) { 
//                nBlanks /= 2;
//                itemsPerRow *= 2;
//                column = 0;
//                System.out.println();
//                
//            } else {
//                for (int k = 0; k < nBlanks * 2 - 2; k++) {
//                    System.out.print(' ');
//                }
//            }
//        }
//        System.out.println("\n" + dots + dots);
//    }
//
//    public void displayArray() {
//        for (int j = 0; j < maxSize; j++) {
//            System.out.print(heapArray[j].getKey() + " ");
//        }
//        System.out.println("");
//    }
//
//} //akhir class Heap    
//            
//public class HeapApp {
//     public static void main(String[] args){
//        
//        Heap HA = new Heap(35);
//
//
//        //45,95,35,65,25,55,75,15,125,115,85,105
//        HA.insert(45);
//        HA.insert(95);
//        HA.insert(35);
//        HA.insert(65);
//        HA.insert(25);
//        HA.insert(55);
//        HA.insert(75);
//        HA.insert(15);
//        HA.insert(125);
//        HA.insert(115);
//        HA.insert(85);
//        HA.insert(105);
//        
//        HA.displayHeap();
//        
//        HA.change(3, 62);
//        HA.displayHeap();
//        
//         
//
//     }
//}