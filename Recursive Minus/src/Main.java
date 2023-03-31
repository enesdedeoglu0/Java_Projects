//ENES DEDEOĞLU 31.03.2023

import java.util.Scanner;
public class Main {
    static void desenb(int x, int temp) {

        if (x > 0) {
            System.out.print(x + " ");
            desenb(x - 5, temp);
        } else if (x <= 0) {
            desenx(x, temp);
        }
    }

    static void desenx(int x, int temp) {
        if (temp >= x) {
            System.out.print(x + " ");
            desenx(x + 5, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("LUTFEN SAYI GIRINIZ :  ");
        int x = scan.nextInt();
        int temp = x;
        desenb(x, temp);
    }
}