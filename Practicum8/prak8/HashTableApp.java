package Practicum8.prak8;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package temu8.newpackage;
//
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// *
// * @author -ACER-
// */
// class Data {
//    private int data; 
//
//    public Data(int data) { 
//        this.data = data;
//    }
//
//    public int getKey() { 
//        return data; 
//    }
//}
//
//class HashTable{
//    private Data[] hashArray;
//    private int size;
//
//    public HashTable(int size) { 
//        this.size = size;
//        hashArray = new Data[size];
//    }
//
//    public void displayTable() { 
//        System.out.println("Table: ");
//        for (int j = 0; j < size; j++) {
//            if (hashArray[j] != null) { 
//                System.out.println(" | "+j+"\t | " +hashArray[j].getKey() + " |");
//            } else {
//                System.out.println(" | "+j+"\t | -- |");
//            }
//        }
//        System.out.println("");
//    }
//    
//    public int hashFunc(int key) {
//        return key % size;
//    }
//
//    public void insert(int aData) { 
//        Data item= new Data(aData); 
//        int key = item.getKey();
//        int hashVal = hashFunc(key);
//        while (hashArray[hashVal] != null) {
//            ++hashVal; 
//            hashVal %= size;
//        }
//        hashArray[hashVal] = item;
//    }
//
//    public Data delete(int key) { 
//        int hashVal = hashFunc(key);
//        while (hashArray[hashVal] != null) { 
//            if (hashArray[hashVal].getKey() == key) {
//                Data temp = hashArray[hashVal];
//                hashArray[hashVal] = null;
//                return temp;
//            }
//            ++hashVal; 
//            hashVal %= size;
//        }
//        return null;
//    }
//
//    public Data find(int key) {
//        int hashVal = hashFunc(key);
//
//        while (hashArray[hashVal] != null) {
//            if (hashArray[hashVal].getKey()== key) { 
//                return hashArray[hashVal];
//            }
//            ++hashVal; 
//            hashVal %= size;
//        }
//        
//        return null;
//    }
//}
//
//
//class HashTableApp{
//    public static void main(String[] args) throws IOException{
//    Data aData;
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
//    
//}