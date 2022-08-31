package defaultPackage;

import com.sun.xml.internal.ws.wsdl.writer.document.Import;

import java.util.Locale;

public class TPC34 {
    public static void main(String[] args) {
        //java.lang.Stirng를 써야하는데, 왜안하나?
        //Import구문이 생략되어 잇으니까
        String str=new String("APPLE");
        String v=str.toLowerCase(Locale.ROOT);
        System.out.println(v);
        System.out.println(str.charAt(3));//L
        System.out.println(str.length()); //5
        System.out.println(str.indexOf("PL")); //2
        System.out.println(str.indexOf("PX")); //-1
        System.out.println(str.replaceAll("P","X")); //AXXLE

    }
}
