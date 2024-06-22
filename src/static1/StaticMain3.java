package static1;

public class StaticMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A.count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B.count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C.count = " + Data3.count);
    }
}

/**
 * static 이라는 키워드가 붙은 변수는 힙 영역에서 관리되는 것이 아니라, 메서드 영역에서 관린된다.
 *
 * 붕어빵 틀에서 관리하는 데이터이다.
 * Static 키워드가 붙은 변수에 접근하기 위해서는 클래스 이름 Data3 + `.` access Operator 를 사용하면 된다.
 */