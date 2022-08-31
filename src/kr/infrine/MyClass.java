package kr.infrine;
//default:클래스들끼리 사용가능하지만 외부에서 접근 x
public class MyClass {
    public int sum(int a,int b){
        int hap=0;
        for(int i=0;i<=b;i++){
            hap+=i;
        }
        return hap;
    }
}
