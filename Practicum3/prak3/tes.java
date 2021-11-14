package Practicum3.prak3;

class Queue {
    
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int size){
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(String value){
        if(isEmpty()){
            rear = front;
            queArray[rear] = value;
            System.out.println(value+" masuk antrian");
        }else if (!isFull()){
            rear++;
            queArray[rear] = value;
            System.out.println(value+" masuk antrian");
        }else if(!isFull()){
        System.out.println ("Maaf "+value+", antrian masih penuh");
    }
    }
    public void insert2(String value){
        if(!isFull()){
            rear++;
            queArray[rear] = value;
        }
    }
    public void tampilkan(){
        if(!isEmpty()){
            int index = front;
            while (index <= rear){
                System.out.print(queArray[index]+", ");
                index++;
            }
            System.out.println();
        }
    }
    public String exit(){
        String temp = queArray[front];
        for(int i=front; i<=rear-1;i++){
            queArray[i] = queArray[i+1];
        }
        rear--;
        System.out.println(temp+" keluar antrian");
        return temp;
    }
    public String peekFront(){
        return queArray[front];
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public boolean isFull(){
        return (nItems == maxSize);
    }
    public int size(){
        return nItems;
    }
}
public class tes {
    public static void main (String[]args){
        System.out.println("\n>>beberapa mulai mengantri");
        Queue theQueue = new Queue(4);
        theQueue.insert("Andi");
        theQueue.insert("Ahmad");
        theQueue.insert("Satrio");
        theQueue.insert("Afrizal");
        theQueue.insert("Sukran");
        theQueue.insert("Mahmud");
        
        System.out.println("\n>>isi antrian");
        theQueue.tampilkan();
        
        System.out.println("\n>>satu persatu keluar antrian");
        while (!theQueue.isEmpty()){
            if(theQueue.peekFront().equals("Kosong")){
                System.out.println("\nantrian kosong");
                System.out.println("0 Orang");
                
                theQueue.tampilkan();
                break;
            }
            String n = theQueue.exit();
            theQueue.insert2("Kosong");
            theQueue.tampilkan();
            System.out.println("");
        }
        System.out.println("");
    }
}
