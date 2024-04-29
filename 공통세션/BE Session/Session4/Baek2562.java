package 공통세션.Session4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max= -101;
        int count = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            int value = Integer.parseInt(st.nextToken());
            if (value > max) {
                max = value;
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
