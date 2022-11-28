package _01_Basic_Java;

import java.util.Scanner;

public class BasicQuestions
{
    public static void main(String[] args) {

        //  **I love java** olan bir String oluşturun.
//        Bu cümlenin toplam karakter sayısını yazdırın.

        String str= "I love you";
        System.out.println("lenght of str = " + str.length());

        // "apple" olan bir String oluşturun.
//            String'in _içinde_ "app" olup olmadığını **doğrula**.

        String str2= "apple";
        boolean aBoolean=str2.contains("app");
        System.out.println("aBoolean = " + aBoolean);

        //**Florida** kelimesinden bir String oluşturun.
//            Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

        String str3="Florida";
        int indx=str3.indexOf("o");
        System.out.println("indx = " + indx);

        // 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.Z.K. şeklinde yazınız.

        Scanner sc= new Scanner(System.in);
        System.out.print("enter your fullname: ");
        String fullName=sc.nextLine();

        char first=fullName.toUpperCase().charAt(0);
        int space= fullName.indexOf(" ");
        char second= fullName.toUpperCase().charAt(space+1);
        int lastSpace= fullName.lastIndexOf(" ");
        char lastLetter= fullName.toUpperCase().charAt(lastSpace+1);

        System.out.println(first+"."+second+"."+lastLetter+".");

//        Girilen bir cümlede kaç kelime olduğunuz bulunuz

        System.out.print("Enter a sencentes: ");
        String str5=sc.nextLine();

        String str5RemoveSpace= str5.replace(" ","");
        int numberOfword= (str5.length()-str5RemoveSpace.length())+1;
        System.out.println("numberOfword = " + numberOfword);


        //    Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.  **** **** **** 4567

        System.out.print("Enter credit card number(format:1111 1111 2222 2222): ");
        String cc= sc.nextLine();
        String cc1=cc.substring(0,14);
        String cc2= cc.substring(15,19);
        System.out.println("secretState = " + "**** **** **** " + cc2);

        // Girilen bir cümledeki son kelimeyi bulunuz
        System.out.print("Enter a sentences: ");
        String str6=sc.nextLine();
        int lastSpace2=str6.lastIndexOf(" ");
        String lastWord=str6.substring(lastSpace2+1,str6.length());
        System.out.println("lastWord = " + lastWord);

    }
}
