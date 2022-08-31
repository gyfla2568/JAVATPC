package defaultPackage;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {
        //궁극적으로 Dog클래스를 사용할 것.
        //1. 직접 사용
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();
        //2. 간접 사용
        //재정의되어야 부모의 eat으로 자식의 eat을 사용할 수 있음.
        //Dog.class, Cat.class밖에 없을 경우 사용한다.
        Animal ani = new Dog(); //upcasting
        //서로 상속관계여야 함
        ani.eat();
        ani = new Cat(); //upcasting
        //서로 상속관계여야 함
        ani.eat();

        //ani.night();
        ((Cat) ani).night(); //downcasting

        //eat가 고양이, 개에 맞춰서
        // 다형성 원리
        //상위클래스가 하위클래스에게 동일한 메시지를 보내면 하위클래스가 서로 다르게 동작되는 원리
        //부모에게 반응하는데 반응이 다른 것.
        //upcasting가 적용될 때 다형성 원리가 적용된다.

    }
}
