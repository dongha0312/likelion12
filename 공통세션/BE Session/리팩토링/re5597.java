package 공통세션.리팩토링;

import java.util.Scanner;

public class re5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 입력은 총 28줄, 출석번호는 n ( 1<= n <= 30)
        * 각각의 출석 번호 체크
        * 없는 수 출석번호 중에 제일 작은거 부터 출력, 담줄에 두번째로 작은거 출력
        * */
        int []arr = new int [31];

        // 28개의 출석 번호들을 arr에 저장. 출석한 번호들은 1로 바꿈.
        for (int i = 1; i < 29; i++){
            int inClass = sc.nextInt();
            arr[inClass] = 1;
        }

        //1 부터 31까지 돌리며 저장된 값이 1이 아니면 i번을 출력
        for (int i =1; i < arr.length; i++) {
           if (arr[i] != 1) {
               System.out.println(i);
           }
        }
    }
}
