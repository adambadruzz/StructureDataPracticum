package Practicum4;

//package temu4;
//
//class Queue{
//    Link front, rear;
//    
//    public Queue(){
//    this.front = this.rear = null;
//}
//    
//    public void insert(int nim, String nama){
//        Link temp = new Link(nim, nama);
//        if(this.rear == null){
//        this.front = this.rear = temp;
//        return;
//    }
//        this.rear.next = temp;
//        this.rear = temp;
//    }
//    
//    public void remove(){
//        if(this.front == null)
//            return;
//        
//        Link temp = this.front;
//        this.front = this.front.next;
//        
//        if(this.front == null)
//            this.rear = null;
//    }
//    
//    public void displayList(){
//        System.out.println("Queue(front-->rear):");
//        Link current = front;
//        while(current != null){
//            current.displayLink();
//            current = current.next;
//        }
//        System.out.println("");
//    }
//}
//public class QueueLinkedList {
//    public static void main(String[] args) {
//        Queue queue = new Queue();
//        
//        queue.insert(1665100, "Dee");
//        queue.insert(1665200, "Deaja");
//        queue.displayList();
//        
//        queue.insert(1665300, "Ami");
//        queue.insert(1665300, "Haya");
//        queue.insert(1665300, "Yati");
//        queue.displayList();
//        
//        queue.remove();
//        queue.remove();
//        
//        queue.displayList();
//    }
//}
