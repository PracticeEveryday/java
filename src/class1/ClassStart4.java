package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); // 메모리에 학생 인스턴스를 만든 것이다.
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 90;

        Student[] students = new Student[2];
        System.out.println(students[1]); // 초기화 하지 않으면 Null로 초기화 된다.
        students[0] = student1;     // 자바에서 `대입`은 항상 변수에 들어있는 값을 `복사`한다!!!! << 슈퍼중요
        students[1] = student2;

        System.out.println(students);
        System.out.println(students[0]);
        System.out.println(student1);

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].name + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].name + " 성적: " + students[1].grade);
    }
}


// 변수에는 인스턴스 자체가 들어 있는 것이 아니다!
// 변수에는 인스턴스의 위치를 가리키는 참조 값만 있을 뿐이다.