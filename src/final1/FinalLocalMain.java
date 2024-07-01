package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        // 변수를 세팅한 후 값을 한 번 할당한 뒤에는 값을 절대 바꾸지 못한다 << 이게 final 키워드 이다!!
        final int data1;

        data1 = 10; // 최초 한 번만 할등 가능하다.

        // data1 = 20; 컴파일 오류 발생

        final int data2 = 10; // 변수 선언 시 초기 값 할당
        // data2 = 20; 컴파일 오류 발생!!
    }

    static void method(final int parameter) {
//        parameter = 10; 파라미터 값을 더 이상 바꿀 수 없음
    }
}

/**
 * final 지역 변수는 최초 한 번만 할당할 수 있다.
 * 이 후 값을 변경할 수 없다.
 *
 * 매개 변수에 fianl이 붙으면 메서드 내부에서 값을 변경할 수 없다.
 * 메서드 호출 시점에 사용된 값이 끝까지 사용 된다.
 */