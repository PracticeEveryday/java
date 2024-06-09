package class2;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        a = 20;
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        b = 30;
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30
    }
}

// 기본형은 소문자로 시작한다. int, boolean, float ...
// 참조형은 대문자로 시작한다. String Student ...

// 참조형은 우리가 만들어서 정의하는 것이다.
// 자바에서 잘 쓰라고 만들어 놓은 것은 기본형이다 << 우리가 추가로 더 만들 수 없다.