package static2;

public class DecoData {
    // 인스턴스 변수에 접근하기 위해서는 참조값을 무조건 알고 있어야 한다.
    private int instanceValue;
    private static int staticValue;

    /**
     * static 키워드가 붙은 정적 메서드는 정적 변수 또는 정적 메서드만 호출할 수 있다.
     * Class 영역에 속한 메서드가 스택 영역이나, 힙 영역의 주소를 알 길이 없다. 참조값을 알길이 없다!!
     */
    public static void staticCall() {
//        instanceValue++; // 인스턴스 변수 접근 시 compile error
//        instanceMethod(); // 인스턴스 method 접근 시 compile error


        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    public static void staticCall(DecoData data) {
        // 참조 값을 매개변수로 넘겨주는 경우에는 해당 인스턴스의 인스턴스 변수, 메소드를 사용할 수 있다!
        data.instanceValue++;
        data.instanceMethod();
    }

    // 인스턴스 생성 후 메서드를 호출하는 것은 다 가능하다!
    // 정적 변수 자기 자신의 메서드 모두 접근 가능!
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 method 가능


        DecoData.staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    public static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

    public void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }
}
