package kr.poly;
//부모의 역할로써 하위클래스를 행동시킴으로써 다형성을 보장
public  abstract class Animal { //추상클래스(불완전한 객체) => Animal ani=new Animal(); X
    public abstract void eat(); //추상메서드(불완전한 메서드)

    public void move(){
        System.out.println("무리를 지어서 이동한다.");
    };
}
