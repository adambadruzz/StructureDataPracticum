
package uts;

import java.util.Scanner;

class Link{
    public String nama;
    public Link next;
    public Link prev;
    
    public Link(String nama){
        this.nama = nama;
    }
    
    public void displayLink(){
        System.out.println(nama);
    }
    
    
}

class LinkStack { 
    //private final int maxSize; 
    Link top; 
    
    public LinkStack() { 
        //maxSize = size; 
        top = null; 
    } 
 
    public void push(String nama) { 
        if(top == null){
            top = new Link(nama);
            top.next = null;
            top.prev = null;
        }else{
            Link newStack = new Link(nama);
            newStack.prev = top;
            top.next = newStack;
            top = newStack;          
        }
    } 
 
    public String pop() { 
        Link temp = top;
        top = top.prev;
        //top.next = null;
        return temp.nama;
    } 
 
    public boolean isEmpty() { 
        return (top == null); 
    } 

}
 class Pembalik {
    
    private String kata;
    private String kataKebalik = "";
    
    public Pembalik(String input){
        kata = input;
    }

    public String getKataKebalik() {
        return kataKebalik;
    }
    
   
    public String balik(){ 
        //int stackSize = kata.length(); 
        LinkStack stack = new LinkStack(); 
        
        for(int j=0; j<kata.length(); j++){
            String ch = Character.toString(kata.charAt(j)); 
            stack.push(ch); 
        }
        while( !stack.isEmpty() ){
            String ch = stack.pop();
            kataKebalik += ch; 
        }
        return getKataKebalik();
    } 
   
}


public class AppStackPalindrom {

    public static void main(String[] args) {
        String input, output;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter String: ");
            input = in.nextLine();
            if (input.equals("")) {
                break;
            }

            Pembalik pembalik = new Pembalik(input);
           
            output =  pembalik.balik();
            System.out.println("Dibalik jadi: " + output);

            if (input.equals(output)) {
                System.out.println("kata " + input + " adalah kata polindrome");
                System.out.println(" ");
            } else {
                System.out.println("kata " + input + " bukan kata polindrome");
                System.out.println(" ");
            }
        }
    }

}