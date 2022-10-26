package _06_Algoritma;

import java.util.Scanner;

public class _03_ {
    public static void main(String[] args) {

//        - İçinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String
//        okutunuz
//        okunan bu 3 string içindeki negatif de olabilen sayıları toplayın.
//                Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.
//                Ornek:
//        String num1 = "$15";
//        String num2 = "$20";
//        String num3 = "$30";
//        output ----> 65; olmali
//        String num1 = "$15";
//        String num2 = "$-80";
//        String num3 = "$30";
//        output ----> -1; olmali
        Scanner sc = new Scanner(System.in);
        System.out.print("1. String $ symbol and - you can enter numbers = ");
        String text1 = sc.nextLine();
        System.out.print("2. String $ symbol and - you can enter numbers = ");
        String text2 = sc.nextLine();
        System.out.print("3. String $ stmbol and - you can enter numbers = ");
        String text3 = sc.nextLine();

        int text1Number = Integer.parseInt(text1.replaceAll("[^0-9-]", ""));
        int text2Number = Integer.parseInt(text2.replaceAll("[^0-9-]", ""));
        int text3Number = Integer.parseInt(text3.replaceAll("[^0-9-]", ""));

        if (text1Number + text2Number + text3Number > 0)
            System.out.println("Total positive = " + (text1Number + text2Number + text3Number));
        else System.out.println("Value = -1");

    }
}
