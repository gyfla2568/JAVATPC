package defaultPackage;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {
        //이렇게 만드는 것이 확장성 더 좋음.
        //Animal d=new Dog();
        //타입이 달라서 잘못된 것 아닌가?
        //서로 상속관계이기 때문에 자식의 번지가 부모로 갈 수 있기 때문에 가능하다.

        Dog d=new Dog();
        d.eat(); //?가 결과였으나 dog.java에 가서 재정의 해줬기 때문에 개처럼 먹다.로 변함.
        //dog가 없는 eat을 쓸 수 있는가? 가능하다. 상속이기 때문에 부모가 가지고 있는 eat사용 가능

        Cat c=new Cat();
        c.eat();
        c.night();
        //Animal이라는 부모클래스를 전혀 사용하지 않았다.
        //상속의 이점을 활용하지 않고 있다.
        //dog클래스와 cat클래스를 직접 설계한 사람일 경우에는 어떤 동작이 있는지 알기 때문이ㅏㄷ.
        //그러나 다른 사람이 우리에게 줬을 경우, Dog.class와 Cat.class만 주었을 경우 어떤 기능이 있는지 모르게 된다.
        //따라서 이제부터 어떻게 객체를 만들어야 하냐면
        Animal ani=new Dog(); //upcasting(자동형변환)
        ani.eat(); //?

        ani=new Cat();
        ani.eat(); //?
        //상속관계가 지정되어있고, 재정의 되어있으면
        //하위클래스의 동작 방식을 모르더라도 animal클래스를 통해서 dog,cat클래스를 실행시킬 수 있다.
        //ani.night();할 수 없다.
        //사용하고 싶다면
        ((Cat)ani).night(); //downcasting(강제형변환)
    }
}
