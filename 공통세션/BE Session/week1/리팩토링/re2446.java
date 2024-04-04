package 공통세션.week1.리팩토링;

import java.util.Scanner;

public class re2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N >= 1&& N <= 100){
            //역피라미드
            for (int i = 0; i < N; i++){
                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                for (int k = 0; k < (2*N-1)-(2*i); k++){
                    System.out.print("*");
                }
                System.out.println();
            }

            //정방향 피라미드
            for (int i = 0; i < N-1; i++){
                for (int j = 1; j < (N-1)-i; j++){
                    System.out.print(" ");
                }
                for (int k = 0;k < (3+2*i); k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
