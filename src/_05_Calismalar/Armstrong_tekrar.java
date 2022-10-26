package _05_Calismalar;

import java.util.Scanner;

public class Armstrong_tekrar {
    public static void main(String[] args) {

        //        Kullanıcıdan aldığınız bir sayının "Armstrong" sayısı olup olmadığını bulmaya çalışın.
//
//                Örnek olarak, Bir sayı eğer 4 basamaklı ise ve oluşturan rakamlardan herbirinin 4. kuvvetinin toplamı
//                ( 3 basamaklı sayılar için 3.kuvveti ) o sayıya eşitse bu sayıya "Armstrong" sayısı denir.
//
//        Örnek olarak : 1634 = 1^4 + 6^4 + 3^4 + 4^4

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = sc.nextInt();
        int count=0;
        int num1=num;
        int num2=num;

        do {
           num/=10;
           count++;

        }while (num>0);

        double toplam=0;
        do {
            int bas=num1%10;
            toplam=toplam+Math.pow(bas,count);
            num1/=10;

        }while (num1>0);
        if (toplam==num2) System.out.println("Amstrong sayı");
        else System.out.println("Amstrong sayı değil");


    }
}
