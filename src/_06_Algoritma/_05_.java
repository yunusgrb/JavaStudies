package _06_Algoritma;

import java.util.Scanner;

public class _05_ {
    public static void main(String[] args) {

//        12- Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.
//        Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan
//        harflerin birisini kaldırın
//
//        Örnek: "abc", "cat" --> "abcat"
//               "abc", "dog" -->"abcdog"

        Scanner sc = new Scanner(System.in);
        String[] box = new String[2];
        for (int i = 0; i < box.length; i++) {
            System.out.print("String enter = ");
            box[i] = sc.nextLine();
        }
        String box1=box[0].toLowerCase();
        String box2=box[1].toLowerCase();
        if (box1.charAt(box1.length() - 1) == box2.charAt(0)) {
            String text = box1.substring(0, box1.length() - 1);
            System.out.println("Special spelling = " + "\"" + text+ box2+ "\"");
        } else System.out.println("Regular spelling = " + box1 +" "+ box2);
    }
}
