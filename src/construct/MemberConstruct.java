package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    /**
     * 클래스 이름은 클래스의 이름과 같아야 한다.
     * 즉, 첫 글자가 대문자를 갖는다.
     *
     * 더해서 반환 타입이 없다
     */
    MemberConstruct (String name, int age, int grade) {
        System.out.println("생성자 호출!!! 이름: " + name + " age : " + age + " grade : " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

/**
 * 🤔생성자가 왜 필요할까?
 *
 * 우리는 클래스를 생성하자마자 기본 값들을 세팅하는 경우가 많다.
 * 이를 도와주기 위해 생성자라는 것이 등장했다.
 */


/**
 * MemberInit member2 = new MemberInit();
 * member2.initMember("user2", 16, 80); // 만약 생성자가 없을 때 이 로직을 빠뜨리면 어떻게 될까? << 빈 값이라 nullPointerException의 확률이 높아진다.
 * 생성자가 있게 되면서 인스턴스 생성 이 후 `값들을 할당하도록 하는 제약`이 걸리는 것이다!! << 이것이 매우 중요
 *
 * 생성하는 순간 무조건 값을 생성해야 한다!! < 이때 이것이 중요
 * 만약 생성자 데이터를 안 넣어 주면 컴파일 오류가 발생한다!
 *
 * 생성자 덕에 유령 회원이 생길 가능성이 원천 차단 된다.
 */

// 좋은 프로그램은 무한의 자유가 주어지는 것이 아니라 적절한 제약이 있는 것이다.