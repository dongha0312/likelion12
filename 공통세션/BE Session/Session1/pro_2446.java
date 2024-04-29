package 공통세션.Session1;

import java.util.Scanner;

public class pro_2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 역삼각형 코드
		for (int i = 0; i < N; i++) { // 1 ~ N

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < (2 * N - 1) - (2 * i); k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// 삼각형 코드
		for (int i = 0; i < N - 1; i++) { // N+1 ~ 2N-1

			for (int j = 1; j < (N - 1) - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 3 + 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}