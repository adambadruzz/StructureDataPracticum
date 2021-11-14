///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package uts;
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import static java.lang.System.in;
//import java.util.Scanner;
//
///**
// *
// * @author -ACER-
// */
//
//class stack{
//    
//    private int maxSize;
//    private char[] stackArray;
//    private int top;
//
//    public stack(int max){ // constructor
//        maxSize = max;
//        stackArray = new char[maxSize];
//        top = -1;
//    }
//
//    public void push(char j) {
//        stackArray[++top] = j;
//    }
//
//    public char pop(){ 
//        return stackArray[top--];
//    }
//
//    public char peek(){
//        return stackArray[top];
//        }
//
//    public boolean isEmpty(){ 
//        return (top == -1);
//    }
//} 
//
//class Pembalik{
//    private String input;
//    private String output= "";
//
//    public Pembalik(String in){ // constructor
//        input = in; }
//
//    public String balik(){ 
//        int stackSize = input.length(); 
//        stack theStack = new stack(stackSize); 
//        for(int j=0; j<input.length(); j++){
//            char ch = input.charAt(j); 
//            theStack.push(ch); 
//        }
//        
//        while( !theStack.isEmpty() ){
//            char ch = theStack.pop(); 
//            output += ch; 
//        }
//        return output;
//    } 
//} 
//    
//class AppPembalik{
//    public static void main(String[] args) throws IOException{
//        String input, output;
//        Scanner in = new Scanner(System.in);
//        
//    while(true){
//        System.out.print("Enter String: ");
//        input = in.nextLine(); 
//            if( input.equals("") ) 
//    break;
//
//    Pembalik pembalik = new Pembalik(input);
//    output = pembalik.balik(); 
//    System.out.println("dibalik jadi: " + output);
//    
//    if(input.equals(output)){
//        System.out.println("kata " + input + " adalah kata polindrome");
//        System.out.println(" ");
//    }
//    else{
//        System.out.println("kata " + input + " bukan kata polindrome");
//        System.out.println(" ");
//    }
//    } 
//} 
//}
