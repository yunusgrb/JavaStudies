package _02_Loops;

import java.util.Scanner;

public class SwitchCaseLoop {
    public static void main(String[] args) {

        {
            //     Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız
            Scanner oku=new Scanner(System.in);
            System.out.print("12 aydan birinin numarasını giriniz = ");
            int ayNo=oku.nextInt();
            switch (ayNo){
                case 1:System.out.println("Girdiğiniz ay Ocak");break;
                case 2:System.out.println("Girdiğiniz ay Şubat");break;
                case 3:System.out.println("Girdiğiniz ay Mart");break;
                case 4:System.out.println("Girdiğiniz ay Nisan");break;
                case 5:System.out.println("Girdiğiniz ay Mayıs");break;
                case 6:System.out.println("Girdiğiniz ay Haziran");break;
                case 7:System.out.println("Girdiğiniz ay Temmuz");break;
                case 8:System.out.println("Girdiğiniz ay Ağustos");break;
                case 9:System.out.println("Girdiğiniz ay Eylül");break;
                case 10:System.out.println("Girdiğiniz ay Ekim");break;
                case 11:System.out.println("Girdiğiniz ay Kasım");break;
                case 12:System.out.println("Girdiğiniz ay Aralık");break;
                default:System.out.println("Girilen numara ay numarası değildir.");

            }
        }
        {
            //     Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.
            Scanner oku=new Scanner(System.in);
            System.out.print("3 basamaklı bir sayı giriniz = ");
            int sayi= oku.nextInt();
            int birler=sayi%10;
            int onlar=(sayi/10)%10;
            int yuzler=(sayi/100)%10;

            switch (yuzler){
                case 0:System.out.print("Sıfır");break;
                case 1:System.out.print("yüz");break;
                case 2:System.out.print("İkiyüz");break;
                case 3:System.out.print("Üçyüz");break;
                case 4:System.out.print("Dörtyüz");break;
                case 5:System.out.print("Beşyüz");break;
                case 6:System.out.print("Altıyüz");break;
                case 7:System.out.print("Yediyüz");break;
                case 8:System.out.print("Sekizyüz");break;
                case 9:System.out.print("Dokuzyüz");break;  }
            switch (onlar){
                case 0:System.out.print(" ");break;
                case 1:System.out.print("On");break;
                case 2:System.out.print("Yirmi");break;
                case 3:System.out.print("Otuz");break;
                case 4:System.out.print("Kırk");break;
                case 5:System.out.print("Elli");break;
                case 6:System.out.print("Altmış");break;
                case 7:System.out.print("Yetmiş");break;
                case 8:System.out.print("Seksen");break;
                case 9:System.out.print("Doksan");break;  }
            switch (birler){
                case 0:System.out.print(" \n");break;
                case 1:System.out.print("Bir\n");break;
                case 2:System.out.print("İki\n");break;
                case 3:System.out.print("Üç\n");break;
                case 4:System.out.print("Dört\n");break;
                case 5:System.out.print("Beş\n");break;
                case 6:System.out.print("Altı\n");break;
                case 7:System.out.print("Yedi\n");break;
                case 8:System.out.print("Sekiz\n");break;
                case 9:System.out.print("Dokuz\n");break;  }

        }

        {
            //   20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.+
            int minSayi=20;
            int maxSayi=80;
            int sayi=(int) (Math.random()*(maxSayi-minSayi+1))+minSayi;
            System.out.println("Random Sayı = " + sayi);
            int birler=sayi%10;
            switch (birler){
                case 0:System.out.print("Random sayı birler basamağı = Sıfır");break;
                case 1:System.out.print("Random sayı birler basamağı = Bir");break;
                case 2:System.out.print("Random sayı birler basamağı = İki");break;
                case 3:System.out.print("Random sayı birler basamağı = Üç");break;
                case 4:System.out.print("Random sayı birler basamağı = Dört");break;
                case 5:System.out.print("Random sayı birler basamağı = Beş");break;
                case 6:System.out.print("Random sayı birler basamağı = Altı");break;
                case 7:System.out.print("Random sayı birler basamağı = Yedi");break;
                case 8:System.out.print("Random sayı birler basamağı = Sekiz");break;
                case 9:System.out.print("Random sayı birler basamağı = Dokuz");break;

            }




        }

    }
}
