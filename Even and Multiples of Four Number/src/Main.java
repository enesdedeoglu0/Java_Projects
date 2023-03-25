// ENES DEDEOĞLU 25.03.2023

import java.util.Scanner;

 class EvenandMultiplesoffourNumber  {
    public static void main(String[] args) {
        int gsayi = 0, toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("LUTFEN BIR SAYI GIRINIZ  : ");
            gsayi = input.nextInt();
            if (gsayi % 4 == 0 ) toplam+=gsayi;
        }
            while (gsayi % 2 == 0);
                 System.out.println("Girdiğiniz sayıların toplamı : "+ toplam );
                 if (toplam == 0 )
                     System.out.println(" UZGUNUZ HIC 4'UN KATI BIR SAYI GIRMEDINIZ :(");


    }


}