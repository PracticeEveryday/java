package memory;

public class MemoryStackMain1 {
    // 프로그램의 실행은 스택에 쌓인다. 즉, 나중에 호출한 것이 먼저 끝나고 나오는 것이다.
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");

        System.out.println("method2 end");
    }
}

/**
 * 자바는 스택 영역을 사용하여 메서드 호출과 지역 변수를 관리한다.
 * 메서들르 계속 호출하면 스택 영역에 프레임이 쌓이게 되고, 나중에 호출된 함수가 먼저 빠져 나간다.
 * 스택 프레임에 아무 것도 남지 않게 되면 자바는 프로그램을 종료한다.
 */