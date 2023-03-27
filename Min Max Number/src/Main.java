//ENES DEDEOĞLU 27.03.2023

import java.util.Scanner;

 class MinMax {
    public static void main(String[] args) {
        int n, min_sayi = Integer.MAX_VALUE, max_sayi = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);

        System.out.print("KAC TANE SAYI GIRECEKSINIZ : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". SAYIYI GIRINIZ : ");
            int sayi = input.nextInt();
            if (sayi > max_sayi) {
                max_sayi = sayi;
            }
            if (sayi < min_sayi) {
                min_sayi = sayi;
            }
        }

        System.out.println("GIRDIGINIZ SAYILARDAN EN KUCUK SAYI : " + min_sayi + "\n GIRDIGINIZ SAYILARDAN EN BUYUK SAYI : " + max_sayi);
    }
}