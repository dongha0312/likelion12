package 공통세션.리팩토링;

import java.util.Scanner;

public class re2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i < 10; i++){
            System.out.println(N + " * " + i +" = " + (N*i));
        }
        sc.close();
    }
}
