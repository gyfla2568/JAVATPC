package defaultPackage;

import kr.infrine.ObjectArray;
import kr.tpc.A;
import kr.tpc.B;

import java.util.ArrayList;

public class TPC37 {
    public static void main(String[] args) {
        //길이가 5를 넘으면 자동으로 늘려지는 것이 안된다.
        //ObjectArray arr=new ObjectArray(5);
        ArrayList arr=new ArrayList(5);
        //서로다른 타입이지만 Object타입이라 넣는 것이 가능하다.
        arr.add(new A());
        arr.add(new B());
        arr.add(new A());
        arr.add(new B());
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());

        for(int i=0;i<arr.size();i++){
            Object o=arr.get(i);
            if(o instanceof A){
                ((A)o).go();

            }else{
                ((B)o).go();
            }
        }
    }
}
