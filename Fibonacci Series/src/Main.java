// ENES DEDEOĞLU 27.03.2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("LUTFEN DIZININ ELEMAN SAYISINI GIRINIZ :  ");
        int k = sc.nextInt();
        int toplam, a = 0, b = 1;

        for (int i = 1; i < k; i++) {
            System.out.println(a);
            toplam = a + b;
            a = b;
            b = toplam;
        }

    }
}