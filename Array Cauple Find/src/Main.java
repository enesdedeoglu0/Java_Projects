import java.util.Arrays;
public class Main {
    static boolean Find(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] couple = {2, 5, 14, 96, 58, 92, 43, 77, 58,25,45,78,86,81,45,75,99};
        int[] cNumber = new int[couple.length];
        int cCounter = 0;
        for(int i = 0; i < couple.length; i++){
            if(couple[i] % 2 == 0){
                cNumber[cCounter++] = couple[i];
            }
        }
        for(int value: cNumber){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}