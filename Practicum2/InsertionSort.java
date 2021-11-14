package Practicum2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
 

public class InsertionSort
{
    public static void main(String[] args) throws IOException
    {
        //  Objek BufferedReader
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
         
        //  Input jumlah Data
        System.out.print("Masukkan jumlah Data : ");    int jlh_data = Integer.parseInt(dataIn.readLine());
         
        //  Array Data untuk menampung nilai Data
        int[] data = new int[jlh_data];
         
        //  Menu Pengisian data
        System.out.println("\nMenu Pengisian Data");
        System.out.println("1. Di input oleh user");
        System.out.println("2. Di isi oleh program");
        System.out.print("Pilihan : ");     int isi_data = Integer.parseInt(dataIn.readLine());
         
        switch(isi_data)
        {
            case 1  :   //  Pengisian Data oleh si User
                        System.out.println();
                        for(int a = 0; a < jlh_data; a++)
                        {
                            System.out.print("Data ke-"+(a+1)+" : ");   data[a] = Integer.parseInt(dataIn.readLine());
                        }
                         
                            break;
             
            case 2  :   //  Pengisian Data oleh program --> di isi secara acak
                        System.out.println();
                        for(int a = 0; a < jlh_data; a++)
                            data[a] = new Random().nextInt(201);
                         
                        //  Tampilkan Data yang di isi oleh program
                        System.out.print("Data : ");
                        for(int a = 0; a < jlh_data; a++)
                            System.out.print(data[a]+" ");
                         
                            break;
                             
            default :   System.out.println("\nPilihan tidak tersedia");
        }
         
        //  Proses Insertion Sort
        System.out.println("\nProses Insertion Sort");
        for(int a = 0; a < jlh_data-1; a++)
        {
            System.out.println("Iterasi "+(a+1));

             
            for(int b = a+1; b > 0; b--)
            {
                String pesan = "   --> Tidak ada pertukaran";
                if(data[b] < data[b-1])
                {
                    pesan = "   --> "+data[b]+" tukar posisi dengan "+data[b-1];
                     
                    //  Proses Pertukaran
                    int temp = data[b];
                    data[b] = data[b-1];
                    data[b-1] = temp;
                     
                    System.out.println();
                    for(int c = 0; c < jlh_data; c++)
                        System.out.print(data[c]+"\t");
                     
                    System.out.print(pesan);
                }
                 
                else
                {
                    System.out.println();
                    for(int c = 0; c < jlh_data; c++)
                        System.out.print(data[c]+"\t");
                     
                    System.out.print(pesan);
                        break;
                }
            }
            System.out.println("\n");
        }
         
        //  Tampilkan hasil Sorting
        System.out.print("\nData setelah di Sorting : ");
        for(int a = 0; a < jlh_data; a++)
            System.out.print(data[a]+" ");
         
    }
}
