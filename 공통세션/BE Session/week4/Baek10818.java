package 공통세션.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int min = 1000001;
        int max = -1000001;

        for (int i = 0; i < N; i++){
            int value = Integer.parseInt(st.nextToken());

            if(value < min){
                min = value;
            }
            if(value > max){
                max = value;
            }
        }
        System.out.println(min +" "+ max);
    }
}
