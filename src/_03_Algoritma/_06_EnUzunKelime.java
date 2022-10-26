package _03_Algoritma;

import java.util.Scanner;

public class _06_EnUzunKelime {
    public static void main(String[] args) {
        //- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
// Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.
        Scanner oku = new Scanner(System.in);
        String[] dizi = new String[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Kelime Giriniz:");
            dizi[i] = oku.nextLine();
        }
        int enuzun = dizi[0].length();
        char ilkHarf = ' ';
        char sonHarf = ' ';
        String aralik = "";

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i].length() > enuzun) {
                enuzun = dizi[i].length();


                ilkHarf = dizi[i].charAt(0);
                sonHarf = dizi[i].charAt(dizi[i].length() - 1);
                aralik = dizi[i].substring(1, dizi[i].length() - 1);
            }
        }
        System.out.println(sonHarf + aralik + ilkHarf);
    }
}
