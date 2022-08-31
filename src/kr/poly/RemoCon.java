package kr.poly;

public interface RemoCon { //객체 생성 x: RemoCon r=new RemoCon(); 못함 자식클래스랑 implements로 연관해야함.

    //final static(상수)를 사용가능
    //100이 넘으면 1로 할 수 있을 것.

    public static final int MAXCH=100;    //RemoCon.MAXCH로 생성ㅇ
    int MINCH=1;    //RemoCon.MINCH로 생성ㅇ

    //추상메서드
    public void chUp();
    public void chDown();
    public void internet();
}
