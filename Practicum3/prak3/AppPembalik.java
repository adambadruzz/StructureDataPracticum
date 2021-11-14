package Practicum3.prak3;

import java.util.Scanner;

class Stack { 
    private int maxSize; 
    private char[] stackArray; 
    private int top; 
    
    public Stack(int size) { 
        maxSize = size; 
        stackArray = new char[maxSize]; 
        top = -1; 
    } 
 
    public void push(char item) { 
        stackArray[++top] = item;  
    } 
 
    public char pop() { 
        return stackArray[top--]; 
    } 

    public char peek() { 
        return stackArray[top]; 
 
    } 
 
    public boolean isEmpty() { 
        return (top == -1); 
    } 
 
 
    public boolean isFull() {
        return (top == maxSize - 1); 
    } 
}

class Pembalik{
    private String kataKebalikan;
    
    public void Balikkan(String kata,Stack stack){
        char a;
        for(int i = 0; i<kata.length();i++){
            a = kata.charAt(i);
            stack.push(a);
        }
    }
    
    public String getHasil(Stack stack){
        kataKebalikan= "";
        while(!stack.isEmpty()){
            kataKebalikan += stack.pop();
        }
        return kataKebalikan;
    }
}


public class AppPembalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack theStack = new Stack(20);
        Pembalik turn = new Pembalik();
        
        while(true){
            System.out.print("Masukkan kata : ");
            String kata = input.nextLine();
            turn.Balikkan(kata, theStack);
            System.out.println("Kebalikan : "+turn.getHasil(theStack));          
        }
    }
}
