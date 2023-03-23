// ENES DEDEOĞLU 23.03.2023
import java.util.Scanner;

 class BurcBulma {

    public static void main(String[] args) {
        String burc = "";
        int DogumGunu,DogumAy;
        boolean Hatavarmi=false;
        Scanner input=new Scanner(System.in);

        System.out.print("LUTFEN DOGUN GUNUNUZU GIRINIZ : ");
        DogumGunu=input.nextInt();
        System.out.print("LUTFEN DOGDUĞUNUZ AYI GIRINIZ : ");
        DogumAy=input.nextInt();

        if(DogumAy==1){
            if(DogumGunu>0 && DogumGunu<32) {
                if (DogumGunu < 22) burc = "OGLAK";
                     else burc = "KOVA";}
                        else Hatavarmi=true;
        }
        else if(DogumAy==2){
            if(DogumGunu>0 && DogumGunu<30) {
                if (DogumGunu < 20) burc = "KOVA";
                    else burc = "BALIK";}
                        else Hatavarmi=true;
        }
        else if(DogumAy==3){
            if(DogumGunu>0 && DogumGunu<32) {
                if (DogumGunu < 21) burc = "BALIK";
                    else burc = "KOC";}
                        else Hatavarmi=true;
        }
        else if(DogumAy==4){
            if(DogumGunu>0 && DogumGunu<31) {
                if (DogumGunu < 21) burc = "KOC";
                    else burc = "BOGA";}
                        else Hatavarmi=true;

        }else if(DogumAy==5){
            if(DogumGunu>0 && DogumGunu<32) {
                if (DogumGunu < 22) burc = "BOGA";
                    else burc = "IKIZLER";}
                        else Hatavarmi=true;
        }
        else if(DogumAy==6){
            if(DogumGunu>0 && DogumGunu<31) {
                if (DogumGunu < 23) burc = "IKIZLER";
                    else burc = "YENGEÇ";}
                        else Hatavarmi=true;
        }
        else if(DogumAy==7){
            if(DogumGunu>0 && DogumGunu<32) {
                if (DogumGunu < 23) burc = "YENGEÇ";
                    else burc = "ASLAN";}
                        else Hatavarmi=true;
        }
        else if(DogumAy==8){
            if(DogumGunu>0 && DogumGunu<32) {
                if (DogumGunu < 23) burc = "ASLAN";
                    else burc = "BASAK";}
                        else Hatavarmi=true;
        }
        else if(DogumAy==9){
            if(DogumGunu>0 && DogumGunu<31) {
                if (DogumGunu < 23) burc = "BASAK";
                    else burc = "TERAZI";}
                        else Hatavarmi=true;

        }else if(DogumAy==10){
            if(DogumGunu>0 && DogumGunu<32) {
                if (DogumGunu < 23) burc = "TERAZİ";
                    else burc = "AKREP";}
                        else Hatavarmi=true;
        }
        else if(DogumAy==11){
            if(DogumGunu>0 && DogumGunu<31) {
                if (DogumGunu < 22) burc = "AKREP";
                    else burc = "YAY";}
                        else Hatavarmi=true;
        }
        else if(DogumAy==12) {
            if (DogumGunu > 0 && DogumGunu < 32) {
                if (DogumGunu < 22) burc = "YAY";
                    else burc = "OGLAK";}
                        else Hatavarmi = true;

        }else Hatavarmi=true;

        if (Hatavarmi) System.out.print("GECERSIZ DEGER GIRDINIZ ");
            else System.out.println("BURCUNUZ  : " + burc);


    }

}