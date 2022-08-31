package defaultPackage;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

import java.awt.*;

public class TPC23 {
    public static void main(String[] args) {
        //1.다형성 인수
        Dog d=new Dog();
        Display(d);
        Cat c=new Cat();
        Display(c);

    }

    public static void Display(Animal r){ // 다형성 인수
        r.eat();
        //r이 cat타입일 때 night나오게끔
        if(r instanceof Cat) {
            //r이 cat타입으로부터 만들어졌으면
            //true
            ((Cat)r).night();
        }
    }
}
