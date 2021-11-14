package Practicum5;
import java.util.Scanner;

public class Hanoi {
  
    private static void doMenara(int cakram, char a, char b, char c){
    if(cakram == 1){
    System.out.println("Pindahkan cakram no 1 dari tiang "+a+" ke tiang "+ c+"\n");
    }else{
    doMenara(cakram - 1, a, c, b);
         
    System.out.println("Pindahkan cakram no "+cakram+" dari tiang "+a+" ke tiang "+c+"\n");
         
    doMenara(cakram - 1, b, a, c); 
}}
        public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah cakram: ");
        int cakram = in.nextInt();
        doMenara (cakram, 'A', 'B', 'C');
    }
}
