// ENES DEDEOĞLU 27.03.2023

import java.util.Scanner;

 class ThePerfectNumber {
    public static void main(String[] args) {
        int sayi1, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("LUTFEN BIR SAYI GIRINIZ : ");
        sayi1 = input.nextInt();

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi1) System.out.println(sayi1+ "GIRDIGINIZ SAYI MUKEMMEL SAYIDIR .");
         else System.out.println(sayi1 + " \tGIRDIGINIZ SAYI MUKEMMEL DEGILDIR.");

    }
}