package 공통세션.Session1;

import java.util.Scanner;

public class pro_2703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year >= 1 && year <= 4000) {
            if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}