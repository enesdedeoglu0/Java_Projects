// ENES DEDEOĞLU 27.03.2023
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("LUTFEN OLUSACAK UCGENIN BUYUKLUGU  SAYI GIRNIIZ : ");
        int boy = scanner.nextInt();
        for(int i=boy; i>=1; i--){
            for (int k=boy-i; k>=1; k--){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println(" ");


        }

    }
}