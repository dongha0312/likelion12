package 공통세션.Session2;

import java.util.Scanner;

public class Baek10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total =0;

        int [] arr = new int[5]; //5명
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if (arr[i] < 40){
                arr[i] = 40;
            }
            total += arr[i];
        }
        System.out.println(total/arr.length);
    }
}
