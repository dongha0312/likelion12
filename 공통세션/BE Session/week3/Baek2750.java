package 공통세션.week3;

import java.util.Scanner;
public class Baek2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int temp;

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            for(int j = 1; j <arr.length; j++ ){
                if (arr[j-1]> arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
