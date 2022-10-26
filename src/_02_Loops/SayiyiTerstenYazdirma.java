package _02_Loops;

import java.util.Scanner;

public class SayiyiTerstenYazdirma
{
    public static void main(String[] args) {

// Kullanıcnın gireceği bir sayının basamaklarına göre
// tersi olan sayıyı bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int i= oku.nextInt();
        System.out.print("Tersten yazılışı = ");
        while (i>0){
          System.out.print(i%10);
            i/=10;

            }

    }
}
