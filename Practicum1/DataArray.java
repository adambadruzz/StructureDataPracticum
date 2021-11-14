package Practicum1;
class Mahasiswa{
    private long nim;
    private String nama;
    private String asal;
    
    public Mahasiswa(long nim, String nama, String asal){
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
    }
    
    public void displayMhs(){
        System.out.print("\tNim: "+ nim);
        System.out.print(", Nama: "+ nama);
        System.out.println(", Asal: "+ asal);
    }
    
    public long getNim(){
        return nim;
    }
}

public class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;
    
    public DataArray (int max){
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }
    
    public Mahasiswa find(long searchNim){
        int i;
        for (i = 0;i < nElemen; i++){
            if (mhs[i].getNim()==searchNim){
                break;
            }
        }
        if (i == nElemen){
            return null;
        } else {
            return mhs[i];
        }
    }
    
    public void insert(long nim, String nama, String asal){
        mhs[nElemen] = new Mahasiswa(nim,nama,asal);
        nElemen++;
    }
    
    public boolean delete(long searchNim){
        int i;
        for (i = 0;i < nElemen; i++){
            if (mhs[i].getNim()==searchNim){
                break;
            }
        }
        if (i == nElemen){
            return false;
        } else {
            for(int j = i; j < nElemen; j++){
                mhs[j] = mhs [j + 1];
            }
            nElemen--;
            return true;
        }
    }
    
    public void displayArray(){
        for (int i = 0; i < nElemen; i++){
            mhs[i].displayMhs();
        }
    }
}

