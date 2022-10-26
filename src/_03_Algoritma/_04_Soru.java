package _03_Algoritma;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
//
//        -Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan
//        ve int array'inin(ilk oluşturduğunuz array)
//        ilk ve son elementlerini kapsayan yeni array'e return edin.
//            Oluşturacağınız int array'i =   ([1, 2, 3, 4])
//            Sonuç bu şekilde olmalıdır. [1, 4]

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[4];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz =");
            dizi[i] = oku.nextInt();
        }
        int[] dizi2 = {dizi[0], dizi[3]};

        System.out.println("dizi2 = " + "[" + dizi[0] + "," + dizi[3] + "]");


    }
}
