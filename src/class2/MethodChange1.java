package class2;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 10
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); // 10
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}

// 자바에서 변수에 값을 대입하는 것은 변수에 들어 있는 값을 복사해서 대입한는 것이다.
// 기본형, 참조형 모두 항상 변수에 있는 값을 복사해서 전달한다.

// 매서드 호출 시 매개변수로 전달하는 것도 마찬가지이다.
// 매개변수도 결국 변수일 뿐이다.

// 메서드를 호출하기 위해 전달하는 매개 `변수`도 결국 값을 복사해서 전달할 뿐이다.