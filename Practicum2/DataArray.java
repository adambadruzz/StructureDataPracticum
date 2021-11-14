package Practicum2;
class Mahasiswa{
    private String nama;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    
    public void displayMhs(){
        System.out.print(", Nama: "+ nama);

    }
   

    public String getNama(){
        return nama;
    }
}

public class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;
    
    public DataArray (int max){
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }
    
    
    public void insert(String nama){
        mhs[nElemen] = new Mahasiswa(nama);
        nElemen++;
    }
    
   
   
    public void swap(int one, int two) { 
    Mahasiswa temp = mhs[one]; 
    mhs[one] = mhs[two]; 
    mhs[two] = temp; 
}
 
   public void SelectionSortName() { 
   int awal, i, min; 
   for (awal=0; awal< nElemen-1; awal++) { 
      min = awal; 
      for (i = awal + 1; i < nElemen; i++) { 
           if (mhs[i].getNama().compareTo(mhs[min].getNama())<0) { 
                min = i; 
           } 
      } 
      swap(awal, min);
  } 
}
       
    public void displayArray(){
        for (int i = 0; i < nElemen; i++){
            mhs[i].displayMhs();
        }
    }
}

