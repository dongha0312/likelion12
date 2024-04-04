
package 공통세션.week1;

import java.util.Scanner;

public class pro_25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int X = sc.nextInt(); // 영수증에 적힌 총 금액
        int N = sc.nextInt(); // 종류의 수

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // 각 물건의 가격
            int b = sc.nextInt(); // 각 물건의 개수
            total += a * b;
        }
        if (total == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}