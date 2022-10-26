package _04_Palindrom._2;

import java.util.Scanner;

public class Yontem {
    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);
        System.out.print("Giris yapiniz = ");
        String input = read.nextLine();

        int esitHarfSayisi = 0;
        for (int i = 0; i < input.length()/2 ; i++) {
            if (input.charAt(i) == input.charAt(input.length()-1-i))
                esitHarfSayisi++;
        }
        if (esitHarfSayisi == input.length()/2)
            System.out.println("Palindrom");
        else{
            System.out.println("Girilen bir Palindrom degildir.");
            System.out.print("Palindrom hali su sekildedir = " + input);
            for (int i = 0; i < input.length(); i++) {
                String[] harfListesi = input.split("");
                System.out.print(harfListesi[input.length()-1-i]);}
        }


    }
}
