package _05_Calismalar;

import java.util.ArrayList;

public class MukemmelSayi {
    public static void main(String[] args) {
        //1'den 1000'e kadar olan sayılardan mükemmel sayı olanları ekrana yazdırın.
        // Bunun için bir sayının mükemmel olup olmadığını dönen bir tane fonksiyon yazın.
        //Bir sayının bölenlerinin toplamı kendine eşitse bu sayı mükemmel bir sayıdır. Örnek olarak 6 mükemmel bir sayıdır (1 + 2 + 3 = 6).


        PerfectNum();



    }
    static void PerfectNum() {
        ArrayList<Integer> list=new ArrayList<>();
        for (int j = 2; j < 1000; j++) {
            int sum = 0;
            for (int i = 1; i < (j / 2) + 1; i++) {
                if (j % i == 0) {
                sum += i;
            }
        }
            if (j == sum)
            list.add(j);
    }
        for (Integer s : list)
            System.out.println(s);

    }


}
