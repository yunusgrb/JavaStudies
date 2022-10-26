package _01_Algoritma_1;

import java.util.Scanner;

public class Algoritma_2 {
    public static void main(String[] args) {

        {
//            1- **paper** olan bir String oluşturun.
//            String'i _büyük harfe_ çevirin ve yazdırın.
//            örn: apple > APPLE

            Scanner oku = new Scanner(System.in);
            System.out.print("paper yazınız = ");
            String kelime = oku.nextLine();
            String buyukYazilisi = kelime.toUpperCase();
            System.out.println("Büyük Yazılışı = " + buyukYazilisi);


        }
        {
//            2- **OraNge** olan bir String oluşturun.
//            String'i _küçük harfe_ çevirin ve yazdırın.
//            örn: APPLE > apple
            Scanner oku = new Scanner(System.in);
            System.out.print("OraNge yazınız= ");
            String kelime = oku.nextLine();
            String kucukYazilisi = kelime.toLowerCase();
            System.out.println("Küçük Yazılışı = " + kucukYazilisi);

        }
        {
//            3- **New Jersey** olan bir String oluşturun.
//            String'i _büyük harfe_ çevirin ve yazdırın

            Scanner oku = new Scanner(System.in);
            System.out.print("New Jersey yazınız = ");
            String text = oku.nextLine();
            String buyukHali = text.toUpperCase();
            System.out.println("Büyük Hali = " + buyukHali);

        }
        {
//            4- **New York** olan bir String oluşturun.
//            String'i _küçük harfe_ çevirin ve yazdırın.

            Scanner oku = new Scanner(System.in);
            System.out.print("New York yazınız = ");
            String text = oku.nextLine();
            System.out.println("Küçük Yazılışı = " + text.toLowerCase());

        }
        {
//            5- **PADDLE** olan bir String oluşturun.
//            String'i _küçük harfe_ çevirin ve yazdırın.
            Scanner oku = new Scanner(System.in);
            System.out.print("PADDLE yazınız = ");
            String text = oku.nextLine();
            System.out.println("Küçük Yazılışı = " + text.toLowerCase());

        }
        {
//            6- **apple** olan bir String oluşturun.
//            String'in _içinde_ **app** olup olmadığını **doğrula**.

            Scanner oku = new Scanner(System.in);
            System.out.print("apple yazınız = ");
            String text = oku.nextLine();
            boolean appKontrol = text.contains("app");
            System.out.println("app kelimesi var mı? = " + appKontrol);
        }
        {
//
//            7- Girilen bir cümlede kaç kelime olduğunuz bulunuz

            Scanner oku = new Scanner(System.in);
            System.out.print("Bir cümle giriniz = ");
            String text = oku.nextLine();
            String bosluklariTemizle = text.trim();
            int karakterUzunlugu1 = bosluklariTemizle.length();
            String bosluksuzHali = bosluklariTemizle.replace(" ", "");
            int karakterUzunlugu2 = bosluksuzHali.length();
            int kelimeSayisi = karakterUzunlugu1 - karakterUzunlugu2;
            System.out.println("Kelime Sayısı = " + (kelimeSayisi + 1));

        }



    }
}
