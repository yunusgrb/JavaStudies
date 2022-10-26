package _03_Algoritma;

public class CiftseToplaTekseCikar {
    public static void main(String[] args) {

//        -int Array oluşturun ve elemanları :
//        Eğer sayı çiftse topla, tekse çıkar.
//                **Örneğin:**
//    **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//        Toplamlarını yazdırın.

        int[] dize = {5, 6, 8, 12, 14, 19};
        int toplam = 0;
        for (int i = 0; i < dize.length; i++) {
            if (dize[i] % 2 == 0)
                toplam += dize[i];
            else toplam -= dize[i];
        }
        System.out.println("Toplamlar = " + toplam);

    }
}
