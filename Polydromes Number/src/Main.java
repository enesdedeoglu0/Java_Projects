// ENES DEDEOĞLU 29.03.2023

import java.util.Scanner;

 class palindromsayi {

    static boolean ispolindrom(int number) {
        int temp = number, reversNumber = 0, lastnumber;

        while (temp != 0) {

            System.out.println("SAYI" + temp);
            lastnumber = temp % 10;
            System.out.println("SON BASAMAK" + lastnumber);

            reversNumber = (reversNumber * 10) + lastnumber;
            System.out.println("YENI SAYI" + reversNumber);
            temp /= 10;
            System.out.println("yeni temp" + temp);
            if (number == reversNumber) {
                System.out.println("SAYI BIR POLINDROMDUR");
            } else {
                System.out.println("SAYI BIR POLINDROM SAYI DEGILDIR");
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n1;

        Scanner nu = new Scanner(System.in);
        System.out.print("SAYI");
        n1 = nu.nextInt();
        ispolindrom(n1);

    }
}