package _05_Calismalar;

import java.util.ArrayList;
import java.util.Collections;

public class PisagorUcgeni {
    public static void main(String[] args) {

        //1'den 100'e kadar olan sayılardan pisagor üçgeni oluşturanları
        // ekrana yazdıran bir fonksiyon yazın.(a <= 100,b <= 100)

        pisagorSayiBul();


    }
    static void pisagorSayiBul(){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 1; i <=98 ; i++) {
            for (int j = i+1; j <=99 ; j++) {
                for (int k = j+1; k <=100 ; k++) {
                    if (i*i+j*j == k*k) {
                        ArrayList<Integer> list1 = new ArrayList<>();
                        Collections.addAll(list1, i,j,k);
                        list.add(list1);

                    }

                }

            }


        }
        System.out.println(list);


    }
}
