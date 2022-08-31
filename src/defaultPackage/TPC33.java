package defaultPackage;

import kr.infrine.MyClass;

public class TPC33 {
    public static void main(String[] args) {
        //1번째: 사용하려면 풀네임을 알아야한다.
        kr.infrine.MyClass my=new MyClass();
        int v=my.sum(10,100);
        System.out.println(v);
    }
}
