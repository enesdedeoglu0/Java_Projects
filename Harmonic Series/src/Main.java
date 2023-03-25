// ENES DEDEOĞLU 25.03.2023

import java.util.Scanner;

 class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double sonuc = 0;
        System.out.print("LUTFEN SINIR DEGERININ GIRINIZ  : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sonuc += (1.0 / i);
        }
        System.out.println(sonuc);
    }
}