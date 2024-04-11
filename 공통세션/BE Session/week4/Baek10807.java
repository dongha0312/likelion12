package 공통세션.week4;

import java.io.*;
import java.util.StringTokenizer;

public class Baek10807{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i= 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int V = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if(arr[i] == V ){
                count++;
            }
        }
        System.out.println(count);
    }
}
