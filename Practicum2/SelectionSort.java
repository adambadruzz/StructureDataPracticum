package Practicum2;
import java.util.Scanner;
 
public class SelectionSort
{
    public static void main(String[] args)
    {
        //    Buat Objek Scanner
        Scanner scan = new Scanner(System.in);
         
        //    Input jumlah Data
        System.out.print("Masukkan jumlah Data : ");    int jlh_data = scan.nextInt();
         
        //    Input nilai tiap Data
        int[] data = new int[jlh_data];        //    Array untuk nilai tiap Data
        System.out.println();
        for(int x = 0; x < jlh_data; x++)
        {
            System.out.print("Input nilai Data ke-"+(x+1)+" : ");
            data[x] = scan.nextInt();
        }
         
        //    Tampilkan Data Sebelum di sorting
        System.out.println();
        System.out.print("Data Sebelum di Sorting : ");
        for(int x = 0; x < jlh_data; x++)
            System.out.print(data[x]+" ");
         
        //    Proses Selection Sort
        System.out.println("\n\nProses Selection Sort");
        for(int x = 0; x < jlh_data-1; x++)
        {
            System.out.println("Iterasi ke-"+(x+1)+" : ");
             
             
            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "   Tidak Ada Pertukaran";
            for(int y = x+1; y < jlh_data; y++)
            {
                if(min > data[y])
                {
                    tukar = true;
                    index = y;
                    min = data[y];
                     
                }
            }
             
            if(tukar == true)
            {
                //    Pertukaran Data
                pesan = "   Data "+data[x]+" ditukar dengan Data "+data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }
             
            for(int y = 0; y < jlh_data; y++)
                System.out.print(data[y]+" ");
             
            System.out.println(pesan+"\n");
        }
         
        //    Tampilkan Data Setelah di Sorting
        System.out.print("Data Setelah di sorting : ");
        for(int x = 0; x < jlh_data; x++)
            System.out.print(data[x]+" ");
    }
}