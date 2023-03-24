//ENES DEDEOĞLU 24.03.2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a year : ");
        int year = scanner.nextInt();
        System.out.println("********************");
        if((year % 4 == 0 && Double.valueOf(year / 4) == (int)year / 4) && (year % 100 != 0)){
            System.out.println(year + " ->" + " is a leap year!");
        }else if((year % 100 == 0) && (year % 400 == 0 && Double.valueOf(year / 400) == (int)year / 400)){
            System.out.println(year + " ->" + " is a leap year!");
        }
        else{
            System.out.println(year + " ->" + "isn't a leap year!");
        }
    }
}