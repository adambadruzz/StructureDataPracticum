//package UTS;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author -ACER-
// */
//class Link { 
//    public String KepalaKeluarga,alamat;
//    public int jmlh_anggota;
//    public Link next, previous; 
// 
//    
//    public Link(String KepalaKeluarga,int jmlh_anggota,String alamat) { 
//        this.KepalaKeluarga = KepalaKeluarga; 
//        this.jmlh_anggota = jmlh_anggota; 
//        this.alamat = alamat;
//    } 
//    
//    public void displayLink() { 
//        System.out.println(KepalaKeluarga+", jumlah anggota: "+jmlh_anggota+", alamat: "+alamat); 
//    } 
//    
//    public String getKepalaKeluarga(){
//        return KepalaKeluarga;
//    } 
//} 
//
//
//class DoublyLinkedList { 
//    
//    private Link first; 
//    private Link last; 
// 
//    public DoublyLinkedList() { 
//        first = null; 
//        last = null; 
//    } 
//    
//    public boolean isEmpty() { 
//        return first == null; 
//    } 
//    
//    public void insertFirst(String KepalaKeluarga,int jmlh_anggota,String alamat) { 
//        Link newLink = new Link(KepalaKeluarga,jmlh_anggota,alamat); 
//        if (isEmpty()) { 
//            last = newLink;            
//        } else { 
//            first.previous = newLink; 
//        } 
//        newLink.next = first; 
//        first = newLink; 
//    } 
//    
//
//    
//    public void displayBackward() { 
//        System.out.println("Data Warga RT");
//        Link current = last; 
//        while (current != null) { 
//            current.displayLink(); 
//            current = current.previous; 
//        } 
//        System.out.println(""); 
//    } 
//    
//    public Link find(String key) { 
// 
//        Link head = first; 
//        Link tail = last;
//        
//        while (head.KepalaKeluarga != key && tail.KepalaKeluarga != key ) { 
// 
//            if (head.next == null&&tail.previous == null) { 
// 
//                return null;
// 
//            } else { 
// 
//                head = head.next; 
//                tail = tail.previous;
//                
//                
//            } 
//            
//        } 
//        
//        return tail;
// 
//    }
//    
//    
//}
//
//public class DoublyLinkedListApp { 
//    public static void main(String[] args) { 
//
//        DoublyLinkedList theList = new DoublyLinkedList(); 
//
//        theList.insertFirst("Ali", 4, "Jl. D Belayan no 12");
//        theList.insertFirst("Ahmad", 2, "Jl. D Belayan no 9");
//        theList.insertFirst("Abdurrohman", 3, "Jl. D Belayan no 7");
//        theList.insertFirst("Burhan", 4, "Jl. D Belayan no 6");
//        theList.insertFirst("Bachtiar", 5, "Jl. D Belayan no 10");
//        theList.insertFirst("Sofyan", 1, "Jl. D Belayan no 11");
//        theList.displayBackward(); 
//
//        System.out.println("--tambah nama yang sudah ada--");
//        theList.insertFirst("Ali", 4, "Jl. D Belayan no 12");
//              
//        System.out.println("");
//        
//        System.out.println("--tambah--");
//        theList.insertFirst("Ali", 4, "Jl. D Belayan no 12");
//        theList.insertFirst("Ahmad", 2, "Jl. D Belayan no 9");
//        theList.insertFirst("Abdurrohman", 3, "Jl. D Belayan no 7");
//        theList.insertFirst("Burhan", 4, "Jl. D Belayan no 6");
//        theList.insertFirst("Bachtiar", 5, "Jl. D Belayan no 10");
//        theList.insertFirst("Sofyan", 1, "Jl. D Belayan no 11");
//        theList.insertFirst("Choirul", 6, "Jl. D Belayan no 13");
//        theList.insertFirst("Sujatmoko", 3, "Jl. D Belayan no 15");
//        theList.insertFirst("Galuh", 2, "Jl. D Belayan no 14");
//        theList.insertFirst("Hari", 4, "Jl. D Belayan no 8");        
//        
//        theList.displayBackward(); 
//        
//        System.out.println("--Pencarian--");
//        System.out.println("Cari Aris");
//        Link f = theList.find("Aris"); 
// 
//        if (f != null) { 
// 
//        System.out.println(f.KepalaKeluarga+" telah terdaftar"); 
// 
//        } else { 
// 
//            System.out.println("Aris belum terdaftar"); 
// 
//        } 
//                
//        System.out.println("");
//        
//         System.out.println("Cari Burhan");
//        Link s = theList.find("Burhan"); 
//        if (s!= null) { 
// 
//        System.out.println(s.KepalaKeluarga+" telah terdaftar"); 
// 
//        } else { 
// 
//            System.out.println("Burhan belum terdaftar"); 
// 
//        } 
//    } 
//}