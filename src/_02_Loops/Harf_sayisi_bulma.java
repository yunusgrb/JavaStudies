package _02_Loops;

import java.util.Scanner;

public class Harf_sayisi_bulma {
    public static void main(String[] args) {

//-Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmadan)

        Scanner oku = new Scanner(System.in);
        System.out.print("Cümle giriniz = ");
        String cumle = oku.nextLine();
        String bCumle=cumle.toLowerCase();
        int uzunluk = bCumle.length();
        int adet = 0;
        for (int i = 0; i < uzunluk; i++) {

            if (bCumle.charAt(i) == 'a'){
            adet++;}
        }
        System.out.println(" = " + adet);


    }
}
