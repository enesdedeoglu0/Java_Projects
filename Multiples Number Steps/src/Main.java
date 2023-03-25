// ENES DEDEOĞLU 25.03.2023

import java.util.Scanner;

 class SayininBasamaklariniToplama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("LUTFEN BIR SAYI GIRINIZ  :");
        int sayi = scan.nextInt();

        int basNumber = sayi, baslangicDegeri, toplam = 0;

        while (basNumber != 0) {

            baslangicDegeri = basNumber % 10;
            basNumber /= 10;

            toplam += baslangicDegeri;
        }
        System.out.println("GIRDIGINIZ SAYININ RAKAMLARI TOPLAMI :" + toplam);

    }

}