package kr.tpc;

public class Animal {
    //Dog,Cat 공통특징 -->eat()
    public void eat(){
        System.out.println("?"); //포괄적, 추상적 즉, 구체적이지 x
    }
    public Animal(){
        super(); //new Object(); 이 생략된 것과 같음.
    }

}
