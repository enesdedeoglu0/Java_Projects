// ENES DEDEOĞLU 25.03.2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("LUTFEN ILK SAYIYI GIRINIZ : ");
        int sayi1 = num.nextInt();
        System.out.println();
        System.out.print("LUTFEN IKINCI SAYIYI GIRINIZ  : ");
        int sayi2 = num.nextInt();
        System.out.println();
        int result = 1;
        for (int i = 1; i <= sayi2; i++) {
            result *= sayi1;

        }
        System.out.println("SONUC : " + result);
    }
}