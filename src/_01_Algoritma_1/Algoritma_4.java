package _01_Algoritma_1;

import java.util.Scanner;

public class Algoritma_4
{
    public static void main(String[] args) {
        {
          //  1 - Girilen 3 sayıdan büyük olanı yazdırınız

            Scanner oku=new Scanner(System.in);
            System.out.print("1. Sayıyı giriniz = ");
            int s1= oku.nextInt();
            int buyuk=0;

            if (s1>buyuk){
                buyuk=s1;
                System.out.print("2. Sayıyı giriniz = ");
                int s2= oku.nextInt();
                if (s2>buyuk)
                    buyuk=s2;
                System.out.print("3. Sayıyı giriniz = ");
                int s3= oku.nextInt();
                if (s3>buyuk)
                    buyuk=s3;
                System.out.println("3 Sayıdan en büyüğü = "+buyuk);
            }
        }
        {
         //   2 - Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.
            Scanner oku=new Scanner(System.in);
            System.out.print("Sayıyı giriniz = ");
            int sayi= oku.nextInt();
            int birler=sayi%10;
            int onlar=(sayi/10)%10;
            if (birler==onlar)
                System.out.println("Birler ve Onlar basamakları eşit");
            else
                System.out.println("Birler ve Onlar basamakları eşit değil");
            if (birler%2==1)
                System.out.println("Biler basamağı TEK");
            else
                System.out.println("Biler basamağı ÇİFT");
            if (onlar%2==1)
                System.out.println("Onlar basamağı TEK");
            else
                System.out.println("Onlar basamağı ÇİFT");


        }
        {

          //  3 - Girilen bir keliede bosluk veya A harfinin olup olmadığını kontrol ediniz.

            Scanner oku=new Scanner(System.in);
            System.out.print("Kelime giriniz = ");
            String kelime=oku.nextLine();
            String buyukYap=kelime.toUpperCase();
            if (buyukYap.contains(" "))
                System.out.println("Boşluk var");
            else
                System.out.println("Boşluk yok");
            if (buyukYap.contains("A"))
                System.out.println("A var");
            else
                System.out.println("A yok");



        }

    }
}
