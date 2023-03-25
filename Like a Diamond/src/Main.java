import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("LUTFEN BIR SAYI GIRINIZ :  ");
        int i = scanner.nextInt();

        for (int a = 1; a <= i; a++) {
            for (int b = 1; b <= i - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 1; x <= i - 1; x++) {
            for (int z = 1; z <= x; z++) {
                System.out.print(" ");
            }
            for (int y =(2 * (i - x )-1); y >= 1; y--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}