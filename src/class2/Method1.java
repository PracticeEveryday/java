package class2;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student(); // x001
        initStudent(student1, "학생1", 15, 80);

        Student student2 = new Student();   // x002
        initStudent(student1, "학생2", 18, 90);

        printStudent(student1);
        printStudent(student2);
    }

    // 메서드에 매개변수를 넘길 때는 복사해서 넘긴다
    // 즉, 참조 값이 넘어오게 된다!!!
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
