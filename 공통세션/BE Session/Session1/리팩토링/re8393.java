package 공통세션.Session1.리팩토링;

import java.util.Scanner;

public class re8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total =0;
        for(int i=1; i <= n; i++){
            total+= i;
        }
        System.out.println(total);
    }
}
