import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("LUTFEN KELİME GIRINIZ : ");
        String word = scan.nextLine();
        char[] wordArray = new char[word.length()];
        char[] reverseWordArray = new char[word.length()];

        for (int i = 0; i< word.length();i++){
            wordArray[i] = word.charAt(i);
        }
        int sayac = 0;
        for (int i = word.length()-1; i>=0 ;i--){
            reverseWordArray[sayac] = word.charAt(i);
            sayac++;
        }
        boolean isPalindromik=false;
        for (int i =0;i<word.length();i++){
            if (wordArray[i]!=reverseWordArray[i]){
                isPalindromik=false;
                break;
            }else {
                isPalindromik=true;
            }
        }

        System.out.println("SONUC  = "+ isPalindromik );


    }
}