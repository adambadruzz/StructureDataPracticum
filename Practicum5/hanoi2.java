package Practicum5;
import java.util.Scanner;
public class hanoi2 {
    static int move = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Cakram : ");
        int Cakram = input.nextInt();
        hanoi (Cakram, 'A', 'B', 'C');
    }

    static void hanoi (int Cakram, char a, char b, char c){

    if (Cakram >= 1) { 
        hanoi (Cakram-1, a, c, b);
        move(Cakram, a, c);
        hanoi (Cakram-1, b, a, c);
        }
    }

    static void move (int step, char a, char c){
        System.out.println("Langkah "+move);
        move++;
        System.out.println("Pindahkan Cakram "+step+" dari "+a+" ke "+c);
    }
}
