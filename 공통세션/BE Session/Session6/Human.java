package 공통세션.Session6;

public class Human {

    boolean wear_hoodie;
    boolean wear_glass;
    boolean long_hair;
    int leg;


    Human(){
        leg = 2;
        wear_hoodie = false;
        wear_glass = false;
        long_hair = false;
    }
    void sleep(){
        System.out.println("잠을 잔다. zzz");
    }
    void eat(){
        System.out.println("밥을 먹는다. 냠냠냠");
    }
    void drinking(){
        System.out.println("물을 마십니다.");
    }
    void print(){
        System.out.println("다리:" + leg+"개");
        System.out.println("안경을 썼나요? " + wear_glass);
        System.out.println("후디를 썼나요? " + wear_hoodie);
        System.out.println("긴 머리 인가요? " + long_hair);
        System.out.println("-------------------");
    }
}
