package Practicum6;
public class DataArrayApp {
        public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650260, "Helmi", "Madura");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        
        System.out.println("Sebelum Diurutkan");
        arr.displayArray();
        
        System.out.println("Sesudah Diurutkan Merge Sort NIM");
        arr.MergeSortNim();
        arr.displayArray();
        
        System.out.println("Sesudah Diurutkan Shell Sort Nama");
        arr.ShellSortNama();
        arr.displayArray();        
        
        System.out.println("Sesudah Diurutkan Quick Sort NIM");
        arr.QuickSortNIM();
        arr.displayArray();        
    }
}
