//package uts;
//
//class Link { 
//    public long Nim; 
//    public double Score; 
//    public Link next; 
// 
//    public Link(long Nim,double Score) { 
//        this.Nim = Nim; 
//        this.Score = Score;       
//   } 
// 
//    public void displayLink() {  
//        System.out.print(Nim +", score :"+Score); 
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
//    public void insertFirst(long Nim,double Score) { 
//        Link newLink = new Link(Nim,Score); 
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
//    public Link find(int key) { 
//        Link current = first; 
//        while (current.Nim != key) { 
//            if (current.next == null) { 
//                return null; 
//            } else { 
//                current = current.next; 
//            } 
//        } 
//        return current; 
//    } 
//    
//    public Link rank(int rank){
//        Link current = first;
//        
//        return current;
//}
// 
//    public Link delete(int key) { 
//        Link current = first; 
//        Link previous = first; 
//        while (current.Nim != key) { 
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
//        Link current = first; 
//        while (current != null) { 
//            current.displayLink(); 
//            current = current.next; 
//            System.out.println(""); 
//        } 
//        System.out.println(""); 
//    } 
//    
//        public void displayBatas(int n) { 
//        Link current = first;      
//        for(int i = 0 ;i < n; i++){
//            current.displayLink(); 
//            current = current.next; 
//            System.out.println(""); 
//     }        
//        System.out.println(""); 
//    } 
//        
//        public Link findRank(int rank) { 
//        Link current = first; 
//        rank = rank-1;
//        for(int i = 0; i < rank ; i++){
//            if(i == rank){              
//                return null;
//            }else{
//                current = current.next;
//            }
//        }
//        rank = rank+1;
//        System.out.println("Top - "+rank+" Rank");
//        return current; 
//    }   
//        
//        public void findRankList(int rank) { 
//        Link current = first; 
//        rank = rank-1;
//        for(int i = 0; i < rank ; i++){
//            while(i<rank){              
//            System.out.println("Top - "+rank+" Rank, Nim : "+current.Nim+" dengan score : "+current.Score);
//            rank = rank-1;
//            current = current.next;               
//            }
//        }
//    } 
//        
//        
//} 
//
//public class LinkedListApp {
//    public static void main(String[] args) { 
//        LinkedList theList = new LinkedList();
//        
//        theList.insertFirst(1765018,50.6); 
//        theList.insertFirst(1765011,60.6); 
//        
//        theList.insertFirst(1765010,70.3);     
//        theList.insertFirst(1765013,85.6);                
//        theList.insertFirst(1765009,95.6); 
//
//
//        theList.displayList(); 
//        
//        theList.displayBatas(3);
//        
//        theList.findRankList(4);
//        
//        System.out.println("");
//        Link s = theList.findRank(3);        
//        if (s != null) { 
//            System.out.println("Nim : "+s.Nim+" dengan score : "+s.Score); 
//        } else { 
//            System.out.println("link tidak ditemukan"); 
//        } 
//        System.out.println("");
//
//    } 
//} 
//
