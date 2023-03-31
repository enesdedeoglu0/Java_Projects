// ENES DEDEOĞLU 31.03.2023

import java.util.Scanner;

public class Main {
    public static boolean asal(int sayi, int a) {
        if (a == 1)
            return true;
        else if (sayi % a == 0) return false;
        else return asal(sayi, a - 1);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("LUTFEN SAYI GIRNIZ :  ");
        int sayi = sc.nextInt();

        if (asal(sayi, sayi/2)) {
            System.out.println(sayi + " GIRDIGINIZ SAYI ASAL ");
        } else {
            System.out.println(sayi + "  GIRDIGINIZ SAYI ASAL DEĞİL");
        }
    }
}