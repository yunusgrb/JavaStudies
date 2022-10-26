package _01_Algoritma_1;

import java.util.Scanner;

public class Algoritma_5 {
    public static void main(String[] args) {



        {
            // 1- kullanıcıdan ondalıklı bir sayının ,
            // tam ve ondalıklı kısmını ayrı  ayrı alınız.
            // bu sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip,
            // sonra yazdırınız.

            Scanner oku = new Scanner(System.in);
            System.out.print("Ondalık sayının 1. kısmını gir = ");
            String sayi1 = oku.nextLine();
            System.out.print("Ondalık sayının 2. kısmını gir =");
            String sayi2 = oku.nextLine();
            System.out.println("Ondalık Sayı = " + sayi1.concat(".").concat(sayi2));

        }
        {
            //2- Girilen bir sayı Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise
            //"Able to divide by 9 and 5" yazdırın.
            //Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise
            //"Able to divide by 4 and 5" yazdırın.

            Scanner oku = new Scanner(System.in);
            System.out.print("Sayı giriniz = ");
            int sayi = oku.nextInt();
            if (sayi % 9 == 0 && sayi % 5 == 0)
                System.out.println("Able to divide by 9 and 5");
            if (sayi % 4 == 0 && sayi % 5 == 0)
                System.out.println("Able to divide by 4 and 5");
            else
                System.out.println("Girişiniz 2 şartıda sağlamıyor");

        }
        {
            // 3- Girilen 3 sayıdan en küçük olanını bulunuz.
            Scanner oku = new Scanner(System.in);
            System.out.print("Sayı 1 gir = ");
            int s1 = oku.nextInt();
            int enKck = s1;
            System.out.print("Sayı 2 gir = ");
            int s2 = oku.nextInt();
            System.out.print("Sayı 3 gir = ");
            int s3 = oku.nextInt();
            if (enKck > s2)
                enKck = s2;
            if (enKck > s3)
                enKck = s3;
            System.out.println("En küçük sayı = " + enKck);


        }
        {
            //4-Girilen bir string Eğer String € karakterini kapsıyorsa
            // "This is euro" yazdırın.
            // Eğer String $ karakterini kapsıyorsa
            // "This is dollar" yazdırın.
            // Aksi halde (else) "no money" yazdırın.
            Scanner oku = new Scanner(System.in);
            System.out.print("€ veya $ işareti olan bir kelime giriniz = ");
            String kelime = oku.nextLine();

            if (kelime.contains("€")) {
                System.out.println("This is euro");
            } else {
                if (kelime.contains("$"))
                    System.out.println("This is dollar");
                else
                    System.out.println("No money");
            }


        }
        {
            // 5- Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
            // Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki
            // kurallara göre belirleyecektir:
            // Eğer ortalama not >=90 =>not=A
            // Eğer ortalama not >= 70 ve<90 => not=B
            // Eğer ortalama not >=50 ve <70 =>not=C
            // Eğer ortalama not <50 =>note=F
            // Aşağıdaki örnek çıktıya bakın:
            // int Quiz_score: 80
            // int mid_term_score: 68
            // int Final_score: 90
            // print (Your grade is B)
            // (Notunuz B'dir)
            Scanner oku=new Scanner(System.in);
            System.out.print("Vize notu gir = ");
            int vize= oku.nextInt();
            System.out.print("Final notu gir = ");
            int finalNotu= oku.nextInt();
            System.out.print("Sözlü notu gir = ");
            int sozlu= oku.nextInt();
            int ortalama=(vize+finalNotu+sozlu)/3;
            if (ortalama >= 90) System.out.println("Harf notunuz A GEÇTİNİZ");
            if (ortalama >= 70) System.out.println("Harf notunuz B GEÇTİNİZ");
            if (ortalama >= 50) System.out.println("Harf notunuz C GEÇTİNİZ");
            else  System.out.println("Harf notunuz F KALDINIZ");



        }

    }
}
