package _02_Loops;

import java.util.Scanner;

public class Buyukse_topla {
    public static void main(String[] args) {
        //-Kullanıcıdan 10 sayı isteyiniz, eğer sonra girilen önce girilenden
        // büyük ise döngü sonlansın.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi= oku.nextInt();
        int atanan=0;

        for (int i=0;i<=10;i++){

            atanan=sayi;
            System.out.print("Bir sayı giriniz =");
            sayi= oku.nextInt();
            if (sayi<atanan)
                continue;
            System.out.println("Girilen sayı atanan sayıdan büyük");break;

       }



//        Scanner oku = new Scanner(System.in);
//        int birinciGirilen = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i+". Sayıyı Gir = ");
//            int ikinciGirilen = oku.nextInt();
//
//
//            if (birinciGirilen<ikinciGirilen){
//                System.out.println("Son girelen, önce girilenden küçük\nDURDU");
//                       break;}
//                birinciGirilen=ikinciGirilen;
//
//
    }
}
