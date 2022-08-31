package defaultPackage;

import kr.poly.A;

public class TPC28 {
    public static void main(String[] args) {
        A a=new A();
        a.display();
        System.out.println(a.toString());
        System.out.println(a); //만약 A클래스에서 toString 없애면 번지값을 출력한다. :kr.poly.A@1b6d3586


        Object o=new A(); //upcasting
        ((A)o).display();
        System.out.println(o.toString());
    }
}
