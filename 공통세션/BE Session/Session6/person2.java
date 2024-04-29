package 공통세션.Session6;

public class person2 extends Human{
    person2(){
        super();
        wear_hoodie = true;
        wear_glass = true;
    }

    void talking(){
        System.out.println("나는 말한다.");
    }
    void eat(){
        System.out.println("밥을 먹는다. 쩝쩝쩝");
    }
}
