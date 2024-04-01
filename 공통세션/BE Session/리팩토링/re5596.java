package 공통세션.리팩토링;

import java.util.Scanner;

public class re5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = 0;
        int score2 = 0;

        int totalScore1 = 0;
        int totalScore2 = 0;

        for (int i = 0; i < 4; i++){
            score1 = sc.nextInt();
            totalScore1 += score1;
        }
        for(int i = 0; i < 4; i++){
            score2 = sc.nextInt();
            totalScore2+=score2;
        }
        if (totalScore1 >= totalScore2){
            System.out.println(totalScore1);
        } else {
            System.out.println(totalScore2);
        }
    }
}
