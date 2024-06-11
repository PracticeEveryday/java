package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name;   // name의 이름이 같다. 어떤 scope의 파라미터를 구분할 것인지 도움을 주기 위한 키워드가 `this.`이다!!
        this.age = age;
        this.grade = grade;
    }
}
