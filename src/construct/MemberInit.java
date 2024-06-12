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

/**
 *
 * 🤔 MemberInit member1 = new MemberInit`()` << 이거는 아무 매개변수도 안 넣고 생성자를 호출하는 것 아니야?
 * ✅ 기본 생성자
 *
 * 만약 생성자가 없으면 자바는 기본 생성자를 만들어 준다.
 *
 * 즉, 위의 클래스는 아래와 같은 기본 생성자가 생기는 것이다.
 * MemberInit() {}
 *
 */