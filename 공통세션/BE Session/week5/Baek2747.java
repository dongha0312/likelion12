package 공통세션.week5;

import java.util.Scanner;

public class Baek2747 {

    static int pibo(int a){
        if(a == 0){
            return 1;
        }
        return pibo(a-1)*a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = pibo(n);

        System.out.println(result);
    }
}
