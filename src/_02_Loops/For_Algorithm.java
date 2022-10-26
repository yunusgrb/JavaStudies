package _02_Loops;

import java.util.Scanner;

public class For_Algorithm
{
    public static void main(String[] args) {
        //  Kullanıcıdan 10 adet sayı isteyiniz eğer sayı çift
        // ise toplasın, kullanıcı tek girdiğinde döngü sonlansın.

        Scanner oku=new Scanner(System.in);
        int toplam=0;


        for (int sayac=0;sayac<=10;sayac++)
        { System.out.print("Sayı Gir = ");
            int sayi= oku.nextInt();


          if (sayi%2==0){
            toplam=toplam+sayi;

          }else {
              System.out.println("TEK GİRDİN\nDURDU");break;
          }
          }System.out.println("Cift Sayıların Toplamı = "+toplam);


    }
}
