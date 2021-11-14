package Practicum4;

//package temu4;
//
//class Link { 
//    public int Data; 
//    public Link next; 
// 
//    public Link(int Data) { 
//        this.Data = Data; 
//   } 
// 
//    public void displayLink() {  
//        System.out.print(Data +" "); 
//    } 
//}
// 
//class LinkedList {  
//    private Link first; 
//    public LinkedList() { 
//        first = null; 
//    } 
//
//    public boolean isEmpty() { 
//        return (first == null); 
//    } 
// 
//    public void insertFirst(int Data) { 
//        Link newLink = new Link(Data); 
//        newLink.next = first; 
//        first = newLink; 
//    } 
//    
//    public Link deleteFirst() { 
//        Link temp = first; 
//        first = first.next; 
//        return temp; 
//    } 
// 
// 
//    public Link find(int key) { 
//        Link current = first; 
//        while (current.Data != key) { 
//            if (current.next == null) { 
//                return null; 
//            } else { 
//                current = current.next; 
//            } 
//        } 
//        return current; 
//    } 
// 
//    public Link delete(int key) { 
//        Link current = first; 
//        Link previous = first; 
//        while (current.Data != key) { 
//            if (current.next == null) { 
//                return null; 
//            } else { 
//                previous = current; 
//                current = current.next; 
//            } 
//        } 
//        if (current == first) {
//            first = first.next; 
//        } else { 
//            previous.next = current.next; 
//        } 
//        return current; 
//    } 
//    
//    public Link deleteLast(){
//        if(!isEmpty()){
//            Link temp;
//            Link current;
//            current = first;
//            while(current.next.next!=null){
//                current=current.next;
//            }
//            temp=current.next;
//            current.next=null;
//            return temp;
//        }else{
//            Link temp = first;
//            first = null;
//            return temp;
//        }
//    }
//    
//    public void displayList() { 
//        System.out.println("List(first -->last):"); 
//        Link current = first; 
//        while (current != null) { 
//            current.displayLink(); 
//            current = current.next; 
//        } 
//        System.out.println(""); 
//    } 
//} 
//
//public class LinkedListApp {
//    public static void main(String[] args) { 
//        LinkedList theList = new LinkedList();
//        theList.insertFirst(22); 
//        theList.insertFirst(44); 
//        theList.insertFirst(66); 
//        theList.insertFirst(88); 
//        theList.displayList(); 
// 
//        while (!theList.isEmpty()) { 
//            Link aLink = theList.deleteFirst(); 
//            System.out.print("Deleted "); 
//            aLink.displayLink(); 
//            System.out.println(""); 
//        } 
//        theList.displayList();    
// 
//        theList.insertFirst(33); 
//        theList.insertFirst(55); 
//        theList.insertFirst(77); 
//        theList.insertFirst(88);  
//        theList.displayList(); 
//
//        Link f = theList.find(77); 
// 
//        if (f != null) { 
//            System.out.println("ketemu..." + f.Data); 
//        } else { 
//            System.out.println("link tidak ditemukan"); 
//        } 
// 
//        Link d = theList.delete(88); 
//        if (d != null) { 
//            System.out.println("hapus link dengan key " + d.Data); 
//        } else { 
//            System.out.println("link tidak ditemukan"); 
//        } 
// 
//        theList.displayList(); 
//        
//        theList.deleteLast();
//        
//         theList.displayList(); 
//    } 
//} 
//
