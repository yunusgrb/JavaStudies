package _01_Algoritma_1;

import java.util.Scanner;

public class Algoritma_1
{
    public static void main(String[] args) {
        {

//        1- **I love java** olan bir String oluşturun.
//        Bu cümlenin toplam karakter sayısını yazdırın.

            Scanner oku = new Scanner(System.in);
            String cumle = "I love java";
            int karakterUzunlugu = cumle.length();
            System.out.println("Toplam Karakter Sayısı = " + karakterUzunlugu);
        }
        {
//        2- **Sprint planning** olan bir String oluşturun.
//        Bu dizenin _toplam karakter sayısını_ yazdırın.

            String cumle = "Sprint planning";
            int uzunluk = cumle.length();
            System.out.println("Toplam Karakter Sayısı= " + uzunluk);
        }
        {
//            3- **apple** olan bir String oluşturun.
//            String'in _içinde_ **app** olup olmadığını **doğrula**.

            String kelime="apple";
            boolean kelimeBul=kelime.contains("app");
            System.out.println("app ifadesi var mı? = " + kelimeBul);

        }
        {
//            4- **orange** kelimesinden oluşan bir String oluşturun.
//                String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.
            String kelime="orange";
            boolean esitMi=kelime.equals("apple");
            System.out.println("Eşit mi? = " + esitMi);

        }
        {
//            5- **apple**  olan  bir String oluşturun.
//            String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
//            _Büyük harf veya küçük harf önemli değildir._
            String kelime="apple";
            boolean esitlikKontrol=kelime.equalsIgnoreCase("AppLe");
            System.out.println("Eşitlik var mı? = " + esitlikKontrol);


        }
        {
//            6- **Florida** kelimesinden bir String oluşturun.
//            Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

            String kelime="Florida";
            int index=kelime.indexOf("o");
            System.out.println("O harfinin İndexi = " + index);

        }
        {
//            7- **Thank you** olan bir String oluşturun.
//            Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.
            Scanner oku=new Scanner(System.in);
            System.out.print("Thank you yazınız= ");
            String cumle= oku.nextLine();
            int konum=cumle.indexOf("y");
            System.out.println("Konumu = " + konum);


        }
        {
//            8- **Main method** oluşturun.
//            **Mouse** değerinde bir String oluştur.
//            Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.

            Scanner oku=new Scanner(System.in);
            System.out.print("Mouse yazınız= ");
            String kelime= oku.next();
            char ucuncuSira=kelime.charAt(3);
            System.out.println("3. sıradaki karakter = " + ucuncuSira);



        }
        {
//            ÖZEL SORULAR
//            10 -
//            3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.
            Scanner oku=new Scanner(System.in);
            System.out.print("3 kelimeli isim giriniz= ");
            String ucKelimeliIsim=oku.nextLine();
            char ilkHarf=ucKelimeliIsim.charAt(0);
            int basBosluk=ucKelimeliIsim.indexOf(" ");
            char ikinciHarf=ucKelimeliIsim.charAt(basBosluk+1);
            int sonBosluk=ucKelimeliIsim.lastIndexOf(" ");
            char ucuncuKelime=ucKelimeliIsim.charAt(sonBosluk+1);
            System.out.println(ilkHarf+"."+ikinciHarf+"."+ucuncuKelime+".");


        }





    }
}
