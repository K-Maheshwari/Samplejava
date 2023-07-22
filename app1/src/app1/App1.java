package app1;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner in=new Scanner(System.in);
        int year;
        System.out.println("Enter the year : ");
        year=in.nextInt();
        if (year % 4 == 0 && (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("It is leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }

}
