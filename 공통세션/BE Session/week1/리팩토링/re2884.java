package 공통세션.week1.리팩토링;

import java.util.Scanner;

public class re2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        /*
        24시간 표현.
        45분 보다 작기 때문에 45분을 뺴면 한시간이 줄어듬,
        M은 한시간에서 45-M을 뺌,
        H가 0가 -1을한 시간은 -1시가 될 수 없기에 전날 밤은 23시가 된다.
        */
        if(M < 45){
            H--;
            M = 60 -(45-M);
            if(H < 0){
                H = 23;
            }
            System.out.println(H + " " + M);
        }else{
            System.out.println(H + " "+ (M-45));
        }
    }
}
