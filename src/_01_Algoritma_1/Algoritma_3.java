package _01_Algoritma_1;

import java.util.Scanner;

public class Algoritma_3 {
    public static void main(String[] args) {

        {
            // 1-Girilen bir cümlenin ilk ve son harfini bulunuz
            Scanner oku = new Scanner(System.in);
            //01234567890123456789
            //Bugün hava çok güzel
            System.out.print("Bir cümle giriniz =");
            String cumle = oku.nextLine();
            int uzunluk = cumle.length();
            char ilkHarf = cumle.charAt(0);
            char sonHarf = cumle.charAt(uzunluk - 1);
            System.out.println("İlk Harf = " + ilkHarf + "\nSon Harf = " + sonHarf);
        }
        {
            // 2-Girilen 3 kelimelik bir cumleyi kelimelerine ayırınız

            Scanner oku = new Scanner(System.in);
            System.out.print("3 kelimelik bir cümle giriniz = ");
            String cumle = oku.nextLine();
            int uzunluk = cumle.length();
            int ilkBosluk = cumle.indexOf(" ");
            int ikinciBosluk = cumle.lastIndexOf(" ");
            String birinciKelime = cumle.substring(0, ilkBosluk);
            String ikinciKelime = cumle.substring(ilkBosluk + 1, ikinciBosluk);
            String ucuncuKelime = cumle.substring(ikinciBosluk, uzunluk);
            System.out.println("1. kelime = " + birinciKelime + "\n2. kelime = " + ikinciKelime + "\n3. kelime = " + ucuncuKelime);

        }
        {
            // 3-Girilen 3 kelimelik bir cümlenin kelimelrinin ilk karakterlerini bulunuz
            Scanner oku = new Scanner(System.in);
            System.out.print("3 kelimelik bir cümle giriniz = ");
            String cumle = oku.nextLine();
            char harf1=cumle.charAt(0);
            int ilkBosluk = cumle.indexOf(" ");
            char harf2=cumle.charAt(ilkBosluk+1);
            int ikinciBosluk = cumle.lastIndexOf(" ");
            char harf3=cumle.charAt(ikinciBosluk+1);
            System.out.println(harf1+"."+harf2+"."+harf3);

        }
        {
            //4-Girilen bir kelimenin içerisinde B harifnin geçip geçnmediğini bulunuz.
            Scanner oku = new Scanner(System.in);
            System.out.print("Bir cümle giriniz = ");
            String cumle = oku.nextLine();
            String buyuk=cumle.toUpperCase();
            boolean varMi=cumle.contains("B");
            System.out.println("B harfi var mı? = " + varMi);

        }
        {
            //5-Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.  **** **** **** 4567
            Scanner oku = new Scanner(System.in);
            System.out.print("1111 2222 3333 4567 şeklinde giriniz = ");
            String cumle = oku.nextLine();
            int uzunluk=cumle.length();
            int sonKelime=cumle.lastIndexOf(" ");
            String belirle=cumle.substring(0,sonKelime);
            String gizle=cumle.replaceAll(belirle,"*");
            System.out.println("Gizli gösterim = **** **** ***"+gizle);

        }
        {
            //6-Girilen bir cümledeki son kelimeyi bulunuz
            Scanner oku = new Scanner(System.in);
            System.out.print("Bir cümle giriniz = ");
            String cumle = oku.nextLine();
            int uzunluk=cumle.length();
            int sonBosluk=cumle.lastIndexOf(" ");
            String sonKelime=cumle.substring(sonBosluk+1,uzunluk);
            System.out.println("Son Kelime = " + sonKelime);

        }


    }
}
