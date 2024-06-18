package access.a;

/**
 * 🔥 public 접근 제어자 클래스는 반드시 파일 이름과 동일해야 한다!!
 * 클래스는 접근 제어자 public 과 default 만 둘 수 있다!
 */
public class PublicClass {
    public static void main(String[] args) {
        // 자기 자신 생성
        PublicClass publicClass = new PublicClass();

        // Default 접근 제어자이기 떄문에 다 만들 수 있다.
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();

    }
}

/**
 * public class 를 제외한 default 접근 제어자 클래스는 아주 많이 만들 수 있다.
 * default 클래스는 같은 패키지 내부에서만 접근 가능하다
 */
class DefaultClass1 {

}

class DefaultClass2 {

}