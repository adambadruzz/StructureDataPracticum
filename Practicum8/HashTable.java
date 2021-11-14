package Practicum8;

//package temu8;
//
//public class HashTable {
//
//    private Data[] hashArray;
//    private int size;
//
//    public HashTable(int size) {
//        this.size = size;
//        hashArray = new Data[size];
//        }
//
//    public void displayTable() {
//        System.out.println("Table: ");
//        for (int j = 0; j < size; j++) {
//            if(hashArray[j] != null){
//                System.out.println(" | "+j+"\t | "+hashArray[j].getKey()+" | ");
//            }else{
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
//    public int hashFunc2(int key){
//        return 8 - (key % 8);
//    }
//    
//    public void insert(int key, Data item) {
//        key = item.getKey();
//        int hashVal = hashFunc(key);
//        int hashVal2 = hashFunc2(key);
//        while(hashArray[hashVal] != null){
//            hashVal += hashVal2;
//            hashVal %= size;
//        }
//        hashArray[hashVal] = item;
//    }
//    
//    public Data delete(int key) {
//        int hashVal = hashFunc(key);
//        int hashVal2 = hashFunc2(key);
//        while(hashArray[hashVal] != null){
//            if(hashArray[hashVal].getKey() == key){
//                Data temp = hashArray [hashVal];
//                hashArray[hashVal] = null;
//                return temp;
//            }
//            hashVal += hashVal2;
//            hashVal %= size;
//        }
//        return null;
//    }
//
//    public Data find(int key) {
//        int hashVal = hashFunc(key);
//        int hashVal2 = hashFunc2(key);
//        while(hashArray[hashVal] != null){
//            if(hashArray[hashVal].getKey() == key){
//                return hashArray[hashVal];
//            }
//            hashVal += hashVal2;
//            hashVal %= size;
//        }
//        return null;
//    }
//}
//
