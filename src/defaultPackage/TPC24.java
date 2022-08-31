package defaultPackage;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
    public static void main(String[] args) {
        //2. 다형성 배열
        //DOG,CHAT 지정할 때 배열을 생성하시오?
        //배열을 만들려면 동일한 타입이 아니기에 어렵다.
        //부모로 하면 가능.
        Animal[] ani = new Animal[2];
        //자식타입 담기
        ani[0]=new Dog();
        ani[1]=new Cat();


        for(int i = 0;i<ani.length;i++) {
            ani[i].eat();
            if(ani[i] instanceof Cat){
                //1로 고정시키면 어디있는지 확인해야해서 불편.
                ((Cat)ani[i]).night();
            }
        }
        display(ani);

    }
    //별도의 메서드를 이용해서 만들 수 있음(다형성 배열)
    //ani안에 개와 고양이 서로다른 여러개의 타입을 display(ani); 메서드 배열을 통해 넘겨서
    //아래 함수로 받아서 쓸 수 있다.
    private static void display(Animal[] ani) {
        for(int i = 0;i<ani.length;i++) {
            ani[i].eat();
            if(ani[i] instanceof Cat){
                //1로 고정시키면 어디있는지 확인해야해서 불편.
                ((Cat)ani[i]).night();
            }
        }
    }

}
