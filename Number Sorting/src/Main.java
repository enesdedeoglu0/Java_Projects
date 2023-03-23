// ENES DEDEOĞLU 23.03.2023

import java.util.Scanner;
 class Siralama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int Number1,Number2,Number3;

        System.out.print("LUTFEN 1. SAYIYI GIRNIZ : ");
        Number1=girdi.nextInt();
        System.out.print("LUTFEN 2. SAYIYI GIRNIZ : ");
        Number2=girdi.nextInt();
        System.out.print("LUTFEN 3. SAYIYI GIRNIZ : ");
        Number3=girdi.nextInt();

        if (Number1<Number2 && Number1<Number3){
            if (Number2<Number3){
                System.out.print("Number1 < Number2 < Number3");
            }
            else {
                System.out.print("Number1 < Number3 < Number2");
            }}
        else if (Number2<Number1 && Number2<Number3){
            if (Number1<Number3){
                System.out.print("Number2 < Number1 < Number3");
            }
            else {
                System.out.print("Number2 < Number3 < Number1");
            } }
        if (Number3<Number1 && Number3<Number2){
            if (Number1<Number2) {
                System.out.print("Number3 < Number1 < Number2");
            }
            else {System.out.print("Number3 < Number2 < Number1");
            }
        }
        else ;
    }
}