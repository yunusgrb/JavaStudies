package _02_Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        {

            //  Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz
            Scanner oku = new Scanner(System.in);
            System.out.print("Sayı giriniz = ");
            long sayi = oku.nextLong();
            long sayac = 1;
            long carpim = 1;
            while (sayac <= sayi) {
                carpim *= sayac;
                sayac++;
            }
            long sonuc = carpim;
            System.out.println("Girilen sayıya kadar ki sayıların Çarpımı = " + sonuc);


        }


        {
            //  2-  0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuzç
            int tek = 0;
            int cift = 0;
            int tamToplam = 0;
            int sayac1 = 1;
            int sayac2 = 0;
            int sayac3 = 0;

            while (sayac1 < 100) {
                tek += sayac1;
                sayac1 = sayac1 + 2;
            }
            System.out.println("Tek sayıların toplamı = " + tek);
            while (sayac2 < 100) {
                cift += sayac2;
                sayac2 = sayac2 + 2;
            }
            System.out.println("Çift sayıların toplamı = " + cift);
            while (sayac3 < 100) {
                tamToplam += sayac3;
                sayac3++;
            }
            System.out.println("Bütün sayıların toplamı = " + tamToplam);


        }


        {
            //   3-   100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
            int tek = 0;
            int sayac = 101;
            while (sayac > 1) {
                sayac = sayac - 2;
                System.out.println("Sadece TEK sayılar yaz = " + sayac);
            }


        }


        {
            // 4-  0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.

            int sayac = 0;
            while (sayac <= 100) {
                sayac++;
                if (sayac % 4 == 0 && sayac % 5 == 0) {
                    System.out.println("Bölüne bilen sayı = " + sayac);
                }
            }
        }


        {
            //  5- Sayı bulmaca oyununu tam hali ile cözünüz.

            // Bilgisayarın tuttuğu TUTULAN_SAYI(TS).
            // sayıyı kullanıcının girdiği sayılar ile buldurmaya çalışınız,
            // kullanıcı büyük sayı girer ise KUCUK yazın,
            // küçük sayı girerse BUYUK yazın,
            // bulursa TEBRIKLER yazın.
            // kullanıcıya 10 hak veriniz,
            // bilemez ise HAKKINIZ DOLDU yazın

            Scanner oku = new Scanner(System.in);
            int sayac = 10;
            int randomSayi = (int) (Math.random() * 50);
            do {
                System.out.print("Tahmin giriniz = ");
                int kullaniciTahmini = oku.nextInt();
                sayac--;
                if (kullaniciTahmini > randomSayi) {
                    System.out.println("KÜÇÜK");
                } else {
                    if (kullaniciTahmini < randomSayi) {
                        System.out.println("BÜYÜK");
                    } else {
                        System.out.println("TEBRİKLER "+(10-(10-sayac))+" Hakkınız kala bildiniz");break;
                    }
                }
                System.out.println("Kalan Hakkınız = "+sayac);
            }
            while (sayac > 0  );
            System.out.println("Random Sayı = "+randomSayi);

        }

    }
}
