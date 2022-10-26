package _02_Loops;

import java.util.Scanner;

public class BasHarfleri_yazdirma {
    public static void main(String[] args) {

        //-Girilen bir cümledeki

        // kelimelerin baş harflarini yazdırınız.(Regex kullanmadan)

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz = ");
        String cumle= oku.nextLine();
        String cumle2=cumle.trim();
        char ilkHarf=cumle2.charAt(0);

        System.out.print("İlk Harf = " + ilkHarf+".");

        for (int i = 0; i < cumle2.length(); i++) {
            if (cumle2.charAt(i)==' ')
                System.out.print(cumle2.charAt(i+1)+".");

        }
    }
}
