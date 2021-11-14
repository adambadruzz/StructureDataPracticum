package Practicum1;
import java.util.Scanner;
 
public class BubbleSort
{
    public static void main(String[] args)
    {
        //    Buat Objek Scanner
        Scanner scan = new Scanner(System.in);
         
        //    Input jumlah Data
        System.out.print("Masukkan jumlah Data : ");    int jlh_data = scan.nextInt();
         
        //    Input nilai tiap Data
        int[] data = new int[jlh_data];        //    Array untuk menampung nilai tiap Data
        System.out.println();
        for(int a = 0; a < jlh_data; a++)
        {
            System.out.print("Nilai Data ke-"+(a+1)+" : ");
            data[a] = scan.nextInt();
        }
         
        //    Tampilkan Data Sebelum di Sorting
        System.out.println("\nData Sebelum di Sorting");
        for(int a = 0; a < jlh_data; a++)
            System.out.print(data[a]+" ");
         
        //    Proses Bubble Sort
        System.out.println("\nProses Bubble Sort");
        for(int a = 0; a < jlh_data; a++)
        {
            System.out.println("Iterasi ke-"+(a+1)+" :");
    
             
            System.out.println("");
            for(int b = 0; b < jlh_data-1; b++)
            {
                String pesan = "   Tidak ada pertukaran";
                if(data[b] > data[b+1])
                {
                    //    proses pertukaran nilai Data
                    pesan = "   Data "+data[b]+" ditukar dengan "+data[b+1];
                    int temp = data[b];        //    Variable Sebagai pihak ketiga
                    data[b] = data[b+1];    
                    data[b+1] = temp;
                     
                }
             
                if(b < jlh_data-(a+1))
                {
                    for(int c = 0; c < jlh_data; c++)
                        System.out.print(data[c]+"  ");
                     
                    System.out.println(pesan);;
                }
            }
 
            System.out.println("\n");
        }
         
        //    Tampilkan Data Setelah di Sorting
        System.out.print("Data Setelah di Sorting : ");
        for(int a = 0; a < jlh_data; a++)
            System.out.print(data[a]+"  ");
         
    }
}