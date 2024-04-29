package 공통세션.Session5;

public class test {
    static int min( int a, int b){
        return a-b;
    }
    static float sub(int a, int b){
        float n = a;
        float m = b;
        return n/m;
    }
    static int mul(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        int n = 50;
        int m = 20;

         min(n,m);
         sub(n,m);
         mul(n,m);

        System.out.println(min(n,m));
        System.out.println(sub(n,m));
        System.out.println(mul(n,m));
    }
}
