package defaultPackage;

import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
    public static void main(String[] args) {
        //eat() -->재정의(override) -->eat()
        Animal ani=new Dog();
        ani.eat(); //{?}==>{개} : 재정의했기 때문

        ani=new Cat();
        ani.eat(); //{?}==>{고양이}
        ani.move();
        ((Cat)ani).night(); //downcasting


    }
}
