package 공통세션.Session1.리팩토링;

import java.util.Scanner;

public class re1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count =0;
        int copy = N;
        while (true){
            N= (N%10 *10) + ((N/10 + N % 10)%10);
            count++;
            if (copy == N){
                break;
            }
        }
        System.out.println(count);
    }
}
