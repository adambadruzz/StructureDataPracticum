package Practicum4;

//package temu4;
//
//class Link{
//    public int id;
//    public String nama;
//    public Link next;
//    
//    public Link(int id, String nama){
//        this.id = id;
//        this.nama = nama;
//    }
//    
//    public void displayLink(){
//        System.out.println("{"+id +","+nama+"}");
//    }
//}
//class Stack{
//    Link top;
//    
//    public Stack(){
//        this.top = null;
//    }
//    
//    public void push(int id, String nama){
//        Link temp = new Link(id, nama);
//        temp.next = top;
//        top = temp;
//    }
//   
//    
//    public void pop(){
//        top = top.next;
//    }
//    
//    public void displayList(){
//        System.out.println("\nStack(top --> bottom):");
//        if(top == null){
//            System.out.println("Data Kosong");
//        }else{
//            Link temp = top;
//            while(temp != null){
//                temp.displayLink();
//                temp= temp.next;
//            }
//        }
//    }
//}
//public class StackLinkedList {
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(1, "VCD");
//        stack.push(2, "TV");
//        
//        stack.displayList();
//        
//        stack.push(3, "Kulkas");
//        stack.push(4, "PC");
//        stack.push(5, "Rice Cooker");
//        stack.push(6, "Dispenser");   
//        
//        stack.displayList();
//        
//        stack.pop();
//        stack.pop();
//        
//        stack.displayList();
//    }
//}
