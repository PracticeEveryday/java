package static2;

public class DecoMain2 {

    /**
     * main 함수는 다표적인 정적 메서드이다.
     * 정적 메서드는 정적 메서드만 호출 할 수 있다.
     * 엄연히 말하면 정적 메서드는 같은 클래스 내부의 정적 매서드만 호출 할 수 있다!
     *
     * 그렇기 때문에 main 함수에서 다른 함수를 호출하기 위해 static mehtod를 사용하곤 한 것이다!!
     */
    public static void main(String[] args) {
        String s = "hello java";

        // 인스턴스를 생성하지 않고 바로 호출해서 사용해버린다.
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
