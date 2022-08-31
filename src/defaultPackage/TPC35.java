package defaultPackage;

public class TPC35 {
    public static void main(String[] args) {
        String str1=new String("APPLE");
        String str2=new String("APPLE");

        if(str1==str2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        //Yes가 나오게 하려면?
        //str1번이 가지고 있는 APPLE과 str2번이 가지고 있는 APPLE을 비교
        if(str1.equals(str2)){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }

        String str3="APPLE";
        String str4="APPLE";

        if(str3==str4){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //실제 가리키고 있는 값을 비교
        if(str3.equals(str4)){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}
