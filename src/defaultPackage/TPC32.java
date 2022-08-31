package defaultPackage;

import kr.tpc.Dbconnect;
import kr.tpc.JavaMySql;
import kr.tpc.JavaOracle;

public class TPC32 {
    public static void main(String[] args) {
        //ORACLE,MYSQL->Driver class
        Dbconnect conn=new JavaOracle();
        conn.getConnection("url","bit","12345");

        conn=new JavaMySql();
        conn.getConnection("url","root","abcde");


        //인터페이스만 있으면 하위 클래스를 모두 동작할 수 있다.(=JDBC)
    }
}
