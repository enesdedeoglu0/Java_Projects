//ENES DEDEOĞLU 7.04.2023
public class Main {
    public static void main(String[] args) {
        int[][] matris = { {5,2,7}, {8,1,1}, {6,4,4} };
        int[][] transpoze = new int[3][3];

        System.out.println("MATRİS : ");
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("MATRİS TRANSPOZU : ");
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }
    }
}