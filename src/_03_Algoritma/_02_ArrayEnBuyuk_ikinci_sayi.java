package _03_Algoritma;

public class _02_ArrayEnBuyuk_ikinci_sayi {
    public static void main(String[] args) {

//        -int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dizi = {15, 25, 22, 18, 30};
        int enb = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (enb < dizi[i])
                enb = dizi[i];
        }
        int enb2 = 0;
        for (int i = 0; i < dizi.length; i++) {

            if (enb == dizi[i])
                continue;
            if (dizi[i] > enb2)
                enb2 = dizi[i];
        }
        System.out.println("enb 2 = " + enb2);
        System.out.println("enb = " + enb);


    }
}
