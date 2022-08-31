package kr.tpc;

public class Dog extends Animal{
    //이름, 나이, 종:상태정보
    //부모도 가지고 있고, 자식도 가지고 있는 클래스를 이름을 같게 하는 것을
    //재정의 (override)
    public void eat(){
        System.out.println("개처럼 먹다.");
    }
    public Dog(){
        super(); //new Animal(); 이 생략된 것과 같음.
    }
}
