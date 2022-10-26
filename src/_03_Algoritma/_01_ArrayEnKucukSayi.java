package _03_Algoritma;

public class _01_ArrayEnKucukSayi
{
    public static void main(String[] args) {

//        -int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//        En küçük (minimum) sayıyı yazdırınız.
        int[] dizi=new int[4];
        dizi[0]=14;
        dizi[1]=19;
        dizi[2]=5;
        dizi[3]=21;

        int enk=dizi[0];
        for (int i = 0; i < dizi.length; i++) {

            if (enk>dizi[i])
                enk=dizi[i];
        }
        System.out.println("En küçük = "+enk);

    }
}
