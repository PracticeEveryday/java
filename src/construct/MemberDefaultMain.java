package construct;

public class MemberDefaultMain {
    public static void main(String[] args) {
        MemberDefault memberDefault = new MemberDefault();
    }
}

/**
 *
 * 🤔 MemberDefault memberDefault = new MemberDefault`()`<< 이거는 아무 매개변수도 안 넣고 생성자를 호출하는 것 아니야?
 * ✅ 기본 생성자
 *
 * 만약 생성자가 없으면 자바는 기본 생성자를 만들어 준다.
 *
 * 즉, 위의 클래스는 아래와 같은 기본 생성자가 생기는 것이다.
 * MemberDefault() {}
 */

/**
 * 기본 성생자가 왜 필요할까?
 * 만약 기본 생성자가 없다면, 클래스를 정의할 때마다 의미 없는 코드 << 클래스 이름과 같은 메소드를 무조건 정의해 줘야 한다.
 * 이것도 여간 성가신게 아니다 << 종종 생성자가 없이 클래스가 필요할 때도 많다!
 */

/**
 * 생성자는 반드시 호출 되어야 한다.
 * 생성자가 없다면 자바가 기본 생성자를 만들어 준다.
 * 생성자가 하나라도 있으면 자바는 기본 생성자를 호출하지 않는다. << 이 후 개발자가 직접 정의한 생성자의 스펙에 맞게 호출해야 한다.
 */