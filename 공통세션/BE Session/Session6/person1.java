package 공통세션.Session6;

public class person1 extends Human{
    person1(){
        super();
        long_hair = true;

    }

    void walk(){
        System.out.println("walking slowly");
    }
    void sleep(){
        System.out.println("잠을 잔다. 드르렁");
    }
}
