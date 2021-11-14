package Practicum3.prak3;

//package temu3.prak1;
//class Queue { 
//    private int maxSize;  
//    private String[] queArray;  
//    private int front; 
//    private int rear;  
//    private int nItems; 
// 
//    public Queue(int size) { 
//        this.maxSize = size; 
//        queArray = new String[maxSize]; 
//        front = 0;  
//        rear = -1;  
//        nItems = 0;  
//    } 
//    
//    public void insert1(String value) { 
//        if(isFull()){
//            System.out.println("Maaf "+ value +", antrian masih penuh");
//        }else{
//            queArray[++rear] = value;
//            System.out.println(value + " masuk antrian");
//            nItems++;
//        }
//   }
//    
//    public void insert2(String value){
//        if(rear != maxSize - 1){
//            queArray[++rear] = value;
//            nItems++;
//        }else{
//            rear = -1;
//        }
//    }    
//    
//    public String remove() {  
//        String temp = queArray[front]; 
//        queArray[front] = "Kosong";
//        front++; 
//        if(front == maxSize){
//            front = 0;
//        }
//        nItems--;
//        System.out.println(temp+" keluar antrian");
//        return temp; 
//    }  
//    
//    public void show(){
//        int temp = this.front;
//        for(int i = 0; i < queArray.length; i++){
//            System.out.print(queArray[front++]+",");
//            if(front == maxSize){
//                front = 0;
//            }
//        }
//        System.out.println("\n");
//        front = temp;
//    }
//
//    public String peekFront() { 
//        return queArray[front]; 
//    } 
//    public boolean isEmpty() {  
//        return (nItems == 0); 
//    } 
//    public boolean isFull() { 
//        return (nItems == maxSize); 
//    }  
//    public int size() { 
//        return nItems; 
// 
//    } 
//
// 
//} 
//
//public class AntrianApp {
//    public static void main(String[] args) {
//        Queue theQueue = new Queue(4);
//        System.out.println(">> beberapa mulai mengantri");
//        theQueue.insert1("Andi");
//        theQueue.insert1("Ahmad");
//        theQueue.insert1("Satrio");
//        theQueue.insert1("Afrizal");
//        theQueue.insert1("Sukran");
//        theQueue.insert1("Mahmud");
//        
//        System.out.println("\n>> isi antrian");
//        theQueue.show();
//        
//        System.out.println(">> satu persatu mulai keluar");
//        while(!theQueue.isEmpty()){
//            if(theQueue.peekFront().equals("Kosong")){
//                System.out.println("antrian kosong");
//                System.out.println("0 Person");
//                theQueue.show();
//                break;
//            }
//            theQueue.remove();
//            theQueue.insert2("Kosong");           
//            theQueue.show();
//        }
//    }
//}
