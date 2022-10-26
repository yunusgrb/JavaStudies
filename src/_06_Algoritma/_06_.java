package _06_Algoritma;

import java.util.Arrays;
import java.util.Scanner;

public class _06_ {
    public static void main(String[] args) {
        //  1- 4 elemanlı bir dizi tanımlayınız değerleri kullanıcan alınız.
        //  Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.

        Scanner sc = new Scanner(System.in);
        int[] box = new int[4];
        for (int i = 0; i < box.length; i++) {
            System.out.print("Enter a numbers " + (i + 1) + " = ");
            box[i] = sc.nextInt();
        }
        Arrays.sort(box);
        int different = box[3] - box[0];
        System.out.println("Different " + box[3] + " - " + box[0] + " = " + different);
    }
}
