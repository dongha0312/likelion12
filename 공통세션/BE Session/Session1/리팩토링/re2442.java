package 공통세션.Session1.리팩토링;

import java.util.Scanner;

public class re2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N= sc.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int j = i; j < N; j++){
                System.out.print(" ");
            }

            for (int k = 0; k < (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
