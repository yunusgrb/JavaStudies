package _03_Algoritma;

import java.util.Scanner;

public class _05_Ortalama_alma {
    public static void main(String[] args) {

//        - int Array oluşturun ve elemanları
//        : 12, 14 , 21 ,23 , 10 ,4
//        Array'in ortalamasını alınız.
        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[6];
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz =");
            dizi[i] = oku.nextInt();
        }

        for (int i = 0; i < dizi.length; i++)
            toplam += dizi[i];

        System.out.println("Ortalama = " + (toplam / dizi.length));


    }
}
