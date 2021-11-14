package Practicum8.prak8;

//package temu8.newpackage;
//
//import temu8.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.lang.Math;
//
//public class HashChainApp{
//    public static void main(String[] args) throws IOException{
//    Link aData;
//    int aKey, size, n;
//    System.out.print("Enter size of hash table: ");
//    size = getInt();
//    System.out.print("Enter initial number of items: ");
//    n = getInt();
//    
//    HashTable theHashTable = new HashTable(size);
//    
//        for(int j=0; j<n; j++) {
//            System.out.println("Input ke "+j);
//            aKey = getInt();
//            theHashTable.insert(aKey);
//        }       
//        
//        while(true) {
//            System.out.print("Enter first letter of ");
//            System.out.print("show, insert, delete, or find: ");
//            char choice = getChar();
//        switch(choice){
//            case 's':
//                theHashTable.displayTable();
//                break;
//            case 'i':
//                System.out.print("Enter initial number of items: ");
//                n = getInt();
//                for(int j=0; j<n; j++) {
//                System.out.println("Input ke "+j);
//                aKey = getInt();
//                theHashTable.insert(aKey);
//                }
//                break;
//            case 'd':
//                System.out.print("Enter key value to delete: ");
//                aKey = getInt();
//                theHashTable.delete(aKey);
//                break;
//            case 'f':
//                System.out.print("Enter key value to find: ");
//                aKey = getInt();
//                aData = theHashTable.find(aKey);
//                if(aData != null){
//                System.out.println("Found " + aKey);
//                }
//                else
//                    System.out.println("Could not find " + aKey);
//                break;
//            default:
//                System.out.print("Invalid entry\n");
//        } 
//        }
//} 
//
//    public static String getString() throws IOException{
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        String s = br.readLine();
//        return s;
//    }
//
//    public static char getChar() throws IOException{
//        String s = getString();
//        return s.charAt(0);
//    }
//
//    public static int getInt() throws IOException{
//        String s = getString();
//        return Integer.parseInt(s);
//    }
//}