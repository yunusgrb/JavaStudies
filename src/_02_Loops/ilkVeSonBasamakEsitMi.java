package _02_Loops;

import java.util.Scanner;

public class ilkVeSonBasamakEsitMi {
    public static void main(String[] args) {
        // Kullanıcın girdiği bir sayının

        // ilk ve son basamaklarının

        // eşit olup olmadığınız bulunuz


        Scanner oku=new Scanner(System.in);
        System.out.print("sayı gir = ");
        int sayi= oku.nextInt();

        int ilkBasak=sayi%10;

        int i=0;

        while (sayi>9)
        {
           sayi/=10;
        }
        int sonBasamak=sayi;
        System.out.println((ilkBasak==sonBasamak)?"Eşit":"Değil");

    }
}
