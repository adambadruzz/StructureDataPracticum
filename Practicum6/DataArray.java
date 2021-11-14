package Practicum6;
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
        System.out.print("\tNIM : " + nim);
        System.out.print(", Nama : " + nama);
        System.out.print(", Asal : " + asal);
        System.out.println();
    }

    public long getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }
}

class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;

    public DataArray(int max){
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }

    public void insert(long nim, String nama, String asal){
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }

       public void MergeSortNim() {
        Mahasiswa[] workSpace = new Mahasiswa[nElemen];
        recMergeSort(workSpace, 0, nElemen - 1);
    }

    public void recMergeSort(Mahasiswa[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    public void merge(Mahasiswa[] workSpace, int lowIndex, int highIndex, int upperBound) {
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;
        while (lowIndex <= mid && highIndex <= upperBound) {
            if (mhs[lowIndex].getNim() < mhs[highIndex].getNim()) {
                workSpace[j++] = mhs[lowIndex++];
            } else {
                workSpace[j++] = mhs[highIndex++];
            }
        }
        while (lowIndex <= mid) {
            workSpace[j++] = mhs[lowIndex++];
        }
        while (highIndex <= upperBound) {
            workSpace[j++] = mhs[highIndex++];
        }
        
        for (j = 0; j < nItem; j++) {
            mhs[lowerBound + j] = workSpace[j];
        }
    }

    public void ShellSortNama(){
        int in, out;
        String temp;
        int h = 0;
        h = nElemen/2;
        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = mhs[out].getNama();
                in = out;
                Mahasiswa data_temp = mhs[in];
                while (in > h - 1 && mhs[in - h].getNama().compareTo(temp) > 0) {
                    mhs[in] = mhs[in - h];
                    in -= h;
                }
                mhs[in] = data_temp;
            }
            h /= 2;
        }
    }

    public void QuickSortNIM() {
        recQuickSort(0, nElemen - 1);
    }

    public void recQuickSort(int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) {
            return ;
        } else {
            long pivot = mhs[batasKanan].getNim();
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi - 1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }

    public int partitionIt(int batasKiri, int batasKanan, long pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;
        while (true) {
            while (indexKiri < batasKanan && mhs[++indexKiri].getNim() < pivot) ;
            while (indexKanan > batasKiri && mhs[--indexKanan].getNim() > pivot) ;
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
        }
        return indexKiri;
    }

    public void swap(int one, int two) {
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
    
    public void displayArray(){
        for (int i = 0; i < nElemen; i++){
            mhs[i].displayMhs();
        }
    }
}