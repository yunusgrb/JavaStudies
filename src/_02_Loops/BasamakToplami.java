package _02_Loops;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        //Kullanıcı Tarafından Girilen Sayının Basamakları Toplamını Bulun
        Scanner sc= new Scanner(System.in);
        System.out.print("sayı girniz=");
        int sayi=sc.nextInt();
        int count=0; int toplam=0;

        while (sayi!=0){
             toplam=(sayi%10)+toplam;
            sayi/=10;
        count++;
    }
     System.out.println(count+" basamaklı sayı");
    System.out.println("basamak sayıları toplamı="+ toplam);

}}




