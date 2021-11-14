package Practicum8;


class Data {

    private int data;

    public Data(int data) {
        this.data = data;
    }

    public int getKey() {
        return data;
    }
} 

class HashTable {

    private Data[] hashArray;
    private int size;

    public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];
        }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if(hashArray[j] != null){
                System.out.println(" | "+j+"\t | "+hashArray[j].getKey()+" | ");
            }else{
                System.out.println(" | "+j+"\t | -- |");
            }
        }
        System.out.println("");
    }
    
    public int hashFunc1(int key) {
        return key % size;
    }
    
    public int hashFunc2(int key){
        return 5 - (key % 5);
    }
    
public void insert(int key) {
        Data item = new Data(key); 
        key = item.getKey();
        int hashVal = hashFunc1(key);
        int hashVal2 = hashFunc2(key);

        while(hashArray[hashVal] != null){
            int hashValue = hashVal+hashVal2;
            hashVal = hashValue % size;
        }
        
        hashArray[hashVal] = item;
    }
    
  public Data delete(int key) {
        int hashVal = hashFunc1(key);
        int hashVal2 = hashFunc2(key);
        while(hashArray[hashVal] != null){
            if(hashArray[hashVal].getKey() == key){
                Data temp = hashArray [hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            int hashValue = hashVal+hashVal2;
            hashVal = hashValue % size;
        }
        return null;
    }

    public Data find(int key) {

        int hashVal = hashFunc1(key);
        int hashVal2 = hashFunc2(key);
        while(hashArray[hashVal] != null){
            if(hashArray[hashVal].getKey() == key){
                return hashArray[hashVal];
            }
            int hashValue = hashVal+hashVal2;
            hashVal = hashValue % size;
        }
        return null;
    }
}


public class HashChainApp {
    public static void main(String[] args) {
        HashTable HT = new HashTable(12);
        
        HT.insert(472);
        HT.insert(472);
     
        HT.displayTable();
        
        int key = 887;
        Data f = HT.find(key);
        if (f != null) {
         System.out.println("Successful search for: "+f.getKey());
        }else {
          System.out.println("Unsuccessful search for:"+ f);
         }    
        
         key = 709;
         Data g = HT.find(key);
        if (g != null) {
         System.out.println("Successful search for: "+g.getKey());
        }else {
          System.out.println("Unsuccessful search for: "+key);
         }  
     
}}