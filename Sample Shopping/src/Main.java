// ENES DEDEOĞLU 21.03.2023

import java.util.Scanner;
class main {
    public static void main(String[] args) {

        float armut,elma,domates,muz,patlican,toplam_tutar;
        toplam_tutar = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("ARMUT KAC KILO ISTIYORSUN :  ");
        armut  = inp.nextFloat();
        toplam_tutar += armut * 2.14;

        System.out.print("ELMA KAC KILO ISTIYORSUN :  ");
        elma   = inp.nextFloat();
        toplam_tutar += elma * 3.67;

        System.out.print("DOMATES KAC KILO ISTIYORSUN :  ");
        domates  = inp.nextFloat();
        toplam_tutar += domates * 1.11;

        System.out.print("MUZ KAC KILO ISTIYORSUN :  ");
        muz = inp.nextFloat();
        toplam_tutar += muz * 0.95;


        System.out.print("PATLICAN KAC KILO ISTIYORSUN :  ");
        patlican = inp.nextFloat();
        toplam_tutar += elma * 5;

        System.out.println("TOPLAM TUTAR : "+toplam_tutar);



    }
}