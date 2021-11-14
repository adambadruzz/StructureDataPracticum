//package uts;
//
//class Link { 
//    public long Nim; 
//    public double Score; 
//    public Link next, previous; 
// 
//    public Link(long Nim, double Score) { 
//        this.Nim = Nim; 
//        this.Score = Score; 
//    } 
//    public void displayLink() { 
//        System.out.println(Nim+", Score : "+Score); 
//    } 
//} 
//class DoublyLinkedList { 
//    static Link head;
//    private Link first; 
//    private Link last; 
//    private int size=0;
// 
//    public DoublyLinkedList() { 
//        first = null; 
//        last = null; 
//    } 
//    public boolean isEmpty() { 
//        return first == null; 
//    } 
//    public void insertFirst(long Nim, double Score) { 
//        Link newLink = new Link(Nim,Score); 
//        if (isEmpty()) { 
//            last = newLink; 
//        } else { 
//            first.previous = newLink; 
//        } 
//        newLink.next = first; 
//        first = newLink; 
//        size++;
//    }  
// 
//    
//    public void displayBackward() { 
//        Link current = last; 
//        while (current != null) { 
//            current.displayLink(); 
//            current = current.previous; 
//        } 
//        System.out.println(""); 
//    } 
//
//    public void rerata(int total){
//    Link current = first;
//    double rata = 0;
//        while (current != null) { 
//            rata += current.Score;
//            current = current.next; 
//        } 
//        double ratarata = rata/total;
//        System.out.println("Rerata: "+ratarata); 
//}
//     
//    public void lulus(int lulus,int data) { 
//        Link current = last; 
//        int a = 0,b = 0;
//            for(int i = 0; i < data; i++){
//            if(current.Score > lulus){              
//            current = current.previous;                
//            a++;
//            }else{            
//            b++;
//            }
//         }
//            System.out.println("Jumlah Lulus : "+a);
//            System.out.println("Jumlah Tidak Lulus : "+b);
//    }
//    
//        public void median(){ //method median untuk mencari median atau titik tengah
//        int index = size/2;
//        Link tmp = last;
//        double skor;
//        if(size%2==1){
//            for(int i=0;i<index;i++){
//                tmp = tmp.previous;
//            }
//            skor = tmp.Score;
//        }else{
//            for(int i=0;i<index && i<size ;i++){
//                tmp = tmp.previous;
//            }
//            skor = (tmp.Score + tmp.next.Score)/2;
//        }
//            System.out.println("Median : "+skor);
//    }
//    
//} // akhir class 
//public class DoublyLinkedListAppMhs {
//    public static void main(String[] args) { 
//        DoublyLinkedList theList = new DoublyLinkedList(); 
//        
//        System.out.println("Data :");
//        theList.insertFirst(1765027, 100.0);
//        theList.insertFirst(18650105, 99.0);
//        theList.insertFirst(1765009, 95.6);
//        theList.insertFirst(1765019, 95.0);
//        theList.insertFirst(1765013, 85.5);
//        theList.insertFirst(1765035, 75.0);
//        theList.insertFirst(1765010, 70.3);      
//        theList.insertFirst(1765023, 60.5);    
//        theList.insertFirst(1765029, 55.5);    
//        theList.insertFirst(1765011, 52.7);    
//        
//        theList.displayBackward(); 
//        
//        theList.lulus(90,11);
//        
//        System.out.println("");
//        theList.rerata(11);
//        
//        System.out.println("");
//        
//        //pemanggilan method median dan cetak median
//        theList.median();
//        System.out.println("");
//    } 
//}
//
