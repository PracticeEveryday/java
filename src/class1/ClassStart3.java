package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;

        student1 = new Student(); // 메모리에 학생 인스턴스를 만든 것이다.
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 90;

        System.out.println(student1); // 참조값 찍어보기
        System.out.println(student2); // 참조값 찍어보기

        System.out.println("이름: " + student1.name + " 나이: " + student1.name + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.name + " 성적: " + student2.grade);
    }
}


// 클래스 도입!
// int는 숫자가 들어가게, string은 문자가 들어가게

// 학생이라는 타입(자료형)을 만들어버림
// 학생이라는 자료형이 들어가는 타입을 만들면?
// 사용자가 직접 정의하는 사용자 정의를 위한 설계도가 클래스이다!

// 설계도(클래스)를 사용하여 실제 메모리에 만든 것이 `객체` 또는 `인스턴스`이다.


// 붕어빵 틀 << 클래스
// 붕어빵 << 객체 또는 인스턴스

// 클래스를 통해서 사용자가 원하는 데이터 타입을 마음껏 정의할 수 있다!!


// 클래스라는 설계도로부터 나온 실체들이 객체나 인스턴스이다.

// 인스턴스는 주로 객체가 어떤 클래스에 속해져 있는 지 강조할 때 사용한다.
// << student1 객체는 Student 클래스의 인스턴스이다!

// ~~ 객체는 무슨 인스턴스야?
// 특정 객체가 어떤 클래스로부터 만들어졌다는 것을 강조하고 싶을 때 사용한다.

// 구분하지 않고 사용하니, 막 고민할 필요 없다!