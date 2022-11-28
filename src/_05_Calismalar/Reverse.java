package _05_Calismalar;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        String text = "Herşey Yolunda :)";
        System.out.println(reverse(text));

        StringBuilder text1=new StringBuilder("Everything is OK!");
        System.out.println("ReverseText1="+text1.reverse());

    }

    public static String reverse(String metin) {
        String tersMetin="";
        if (metin.isEmpty())
            return metin;
        else for (int i = metin.length()-1; i >=0; i--) {
            tersMetin+= metin.charAt(i);
        }
        return tersMetin;
          }



    }
