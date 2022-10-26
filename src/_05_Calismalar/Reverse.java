package _05_Calismalar;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        String metin = "Herşey Yolunda :)";
        System.out.println(cevir(metin));

        Scanner input = new Scanner(System.in);
        System.out.print("Birşeyler yazın:");
        String text = input.nextLine();
        reverse(text);
        System.out.println();
        reverse(metin);
    }

    public static String cevir(String metin) {
        String tersMetin="";
        if (metin.isEmpty())
            return metin;
        else for (int i = metin.length()-1; i >=0; i--) {
            tersMetin+= metin.charAt(i);
        }
        System.out.println("tersMetin = " + tersMetin);
        return tersMetin;
          }
     public static void reverse(String kelime){
            for (int i = kelime.length() - 1; i >= 0; i--) //i'yi kelime uzunluğu kadar tanımlıyoruz.
            {
                System.out.print(kelime.charAt(i));
            }


        }
    }
