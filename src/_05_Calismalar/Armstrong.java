package _05_Calismalar;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Kullanıcıdan aldığınız bir sayının "Armstrong" sayısı olup olmadığını bulmaya çalışın.
//
//                Örnek olarak, Bir sayı eğer 4 basamaklı ise ve oluşturan rakamlardan herbirinin 4. kuvvetinin toplamı
//                ( 3 basamaklı sayılar için 3.kuvveti ) o sayıya eşitse bu sayıya "Armstrong" sayısı denir.
//
//        Örnek olarak : 1634 = 1^4 + 6^4 + 3^4 + 4^4


        Scanner sc= new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int num= sc.nextInt();
        int number=num;
        int bas;
        int toplam=0;
        do {
            bas=num%10;
            toplam+=Math.pow(bas,4);
            num/=10;

        }while (num!=0);

        if (toplam==number)
            System.out.println("Armstrong bir sayı");
        else System.out.println("Armstrong sayı değil");


    }
}
