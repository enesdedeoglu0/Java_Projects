//ENES DEDEOĞLU


import java.util.Scanner;

 class Faktoriyel {
    public static void main(String[] args){
        int islem1=1,islem2=1,islem3=1;
        int sonuc;
        Scanner x=new Scanner(System.in);
        System.out.print("n: ");
        int n= x.nextInt();
        System.out.print("r: ");
        int r=x.nextInt();
        System.out.println(n+" VE " +r+ " KOMBİNASYONU :");
        for(int i=1;i<=n;i++){
            islem1*=i;
        }
        for(int j=1;j<=r;j++){
            islem2*=j;
        }
        for(int k=1;k<=(n-r);k++){
            islem3*=k;
        }
        sonuc=(islem1)/(islem2*islem3);
        System.out.println("Sonuç: "+sonuc);

    }
}