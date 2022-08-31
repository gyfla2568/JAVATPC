package defaultPackage;

import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
    public static void main(String[] args) {
        RemoCon r=new TV();
        r.chUp();
        r.chDown();
        r.internet();

        r=new Radio();
        r.chUp();
        r.chDown();
        r.internet();

        //리모콘 하나로 TV와 Radio 두개를 실행할 수 있고 서로 다른 기능을 실행 ㅇ
    }
}
