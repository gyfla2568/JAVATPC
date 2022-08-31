package defaultPackage;

public class TPC02 {
    public static void main(String[] args) {
        //프로그래밍의 3대 요소 : 변수, 자료형(DataType), 할당(=)
        //1+1=2 프로그램을 만들어보자.
        int x=1+1;
        System.out.println(x);
        // 변수: 기억공간을 대표하는 메모리 공간인 이름(크기, 데이터의 종류)
        //변수가 만들어지기 위해서는 1.크기와 2.데이터의 종류가 고려되어야 함.
        //자료형: dataType이 정해져야 변수가 만들어질 수 있음.
        //자료가 데이터를 저장해야 한다면 정수는 int, 실수는 float, 문자는 char, 참거짓은 boolean 이런 것들을 자료형.
        //메모리에 기억공간 하나를 만들려면 변수와 자료형이 결합이 되어야 기억공간이 만들어진다.
        int a, b, c;
        //int(자료형)는 4byte(1. 크기), 종류(2. 정수)이다.
        a=1;
        b=1;
        c=a+b; //2
        System.out.println(c);

        float f; //float, double
        f=34.5f;




    }
}
