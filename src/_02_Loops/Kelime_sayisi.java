package _02_Loops;

import java.util.Scanner;

public class Kelime_sayisi {
    public static void main(String[] args) {
        //-Girilen bir cümledeki kelime sayısını bulunuz.(Regex kullanmadan)
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle = oku.nextLine();
        String cumle2 = cumle.trim();
        int adet = 0;
        for (int i = 0; i < cumle2.length(); i++) {
            if (cumle2.charAt(i) == ' ')
            {
                adet++;
            }
        }
        System.out.println((adet + 1));


    }
}
