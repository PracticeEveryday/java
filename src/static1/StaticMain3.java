package static1;

public class StaticMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A.count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B.count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C.count = " + Data3.count);

        // 인스턴스를 통한 접근
        // 인스턴스로 접근해보고 스태틱이 있으면 그냥 메서드 영역 가서 접근을 해버린다.
        // 인스턴스의 정적, 메서드 영역의 데이터를 쓰는 것이다!
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 권장하지 않는다 << 인스턴스 변수인가? 라는 생각이 든다. << 오해의 소지가 있다.

        // 클래스를 통한 접근
        System.out.println(Data3.count);    // 보자마자 Static 변수인 것으로 보인다.
    }
}

/**
 * static 이라는 키워드가 붙은 변수는 힙 영역에서 관리되는 것이 아니라, 메서드 영역에서 관린된다.
 *
 * 붕어빵 틀에서 관리하는 데이터이다.
 * Static 키워드가 붙은 변수에 접근하기 위해서는 클래스 이름 Data3 + `.` access Operator 를 사용하면 된다.
 */