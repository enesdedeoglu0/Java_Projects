//ENES DEDEOĞLU 31.03.2023

import java.util.Scanner;
public class Main {

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        if (a == 0 && b == 0) {
            System.out.println("TABAN 0 IKEN US DE 0 OLAMAZ ");
        } else {
            System.out.println("SONUC  : " + result);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("TABAN DEGERINI GIRINIZ : ");
            int base = input.nextInt();
            System.out.print("US DEGERINI GIRINIZ : ");
            int exp = input.nextInt();

            power(base,exp);

        }
    }
}