import java.util.Scanner;

 class HarmonicAverage {

    public static void main(String[] args) {Scanner harm=new Scanner(System.in);

        int [] list={1,2,3,45,6,7,8,};
        double ort=0.0;
        double top=0.0;
        for (int i=0;i< list.length;i++)
            top+=1.0/list[i];
        ort= list.length/top;
        System.out.println(ort);
    }
}
