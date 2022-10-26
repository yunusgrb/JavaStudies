package _06_Algoritma;

import java.util.Scanner;

public class _07_ {
    public static void main(String[] args) {

//       Soru 2 -  2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde
//        para simgesi ve rakam olan değerlerle doldurunuz.
//        sonrasında bütün RAKAMLARI toplayıp toplam para değerini bulunuz.

        Scanner sc = new Scanner(System.in);
        String[][] chart = new String[2][3];

        int numberCase;
        int total = 0;
        int counter = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                counter++;
                System.out.print("Enter numbers " + (counter) + " = ");
                chart[i][j] = sc.nextLine();
                numberCase = Integer.parseInt(chart[i][j].replaceAll("[^0-9-]", ""));
                total = total + numberCase;
            }
        }
        System.out.println("Total money value = " + total + " unit");
    }
}
