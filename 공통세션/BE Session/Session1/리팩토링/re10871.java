package 공통세션.Session1.리팩토링;

import java.util.Scanner;

public class re10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //정수 N개
        int X = sc.nextInt(); //정수들이 X 보다 크면 안됨
        int [] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++){
            if (arr[i] < X){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
