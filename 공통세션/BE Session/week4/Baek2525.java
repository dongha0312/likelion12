package 공통세션.week4;

import java.util.Scanner;

public class Baek2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //hr
        int B = sc.nextInt(); // min

        int C = sc.nextInt(); //needed time

        int min = A * 60 + B;
        min += C;

        int hour = (min/60) % 24;
        int minute = min % 60;
        System.out.println(hour + " " + minute);
    }
}

