package class2;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 80);
        System.out.println("student1 주소: " + student1);// 30f39991
        Student student2 = createStudent("학생1", 16, 90);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student 주소: " + student); // 30f39991

        student.name = name;
        student.age = age;
        student.grade = grade;

        return student; // 만들어진 객체를 밖에서 쓸 수 있도록 참조값을 반환해 주어야 한다!!
        // 메소드는 반환 기능을가지고 있다!!
        // 메소드를 실행하고 난 뒤 반환하는 것을 지정해 주어 던져주면 된다.
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
