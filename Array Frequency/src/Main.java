import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.printf("%n DIXI : %1$s%n Repetitions;%n %2$s", Arrays.toString(arr), frequency(arr));

    }

    static String frequency(int[] arr)
    {
        StringBuilder result = new StringBuilder();
        List<int[]> repeatsList = new ArrayList<>();
        for (int key : arr)
        {
            boolean isThere = false;
            for (int[] item : repeatsList)
            {
                if(item[0] == key)
                {
                    item[1]++;
                    isThere = true;
                    break;
                }
            }

            if(!isThere){
                int [] couple = {key, 1};
                repeatsList.add(couple);
            }
        }
        for (int[] couple : repeatsList)
        {result.append("BU SAYI  ").append(couple[0]).append("  ").append(couple[1]).append(" KEZ TEKRAR  ETMISTIR.\n ");
        }
        return result.toString();
    }
}