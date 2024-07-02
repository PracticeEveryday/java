package final1;

/**
 * 상수는 변하지 않고 항상 일정한 값을 갖는 것을 말한다.
 * 보통 하나의 값, 변하지 않는 값을 말한다.
 *
 * static final을 사용하여 변하지 않는 값임을 보장한다.
 * 대문자 + 언더 스코어로 변수명을 설정한다.
 */
public class Constant {
    // 수학 상수
    public static final double PI  = 3.14;

    // 시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    // 어플리케이션 설정 상수
    public static final int MAX_USERS = 1000;
}

/**
 * 애플리케이션을 구현하다 보면 다양한 상수가 존재할 수 있다.
 * 실생활의 상수부터 다양한 커스텀 설정까지 보통 이런 상수는 전역에서 사용되기에 public 접근 제어자를 사용하고 활용한다.
 *
 * 상수는 값을 하나로 활용할 수 있다는 장점도 있다.
 * 상수는 런타임에 변경할 수 없고 값을 변경하기 위해서는 프로그램을 종료하는 수 밖에 없다!!
 */


/**
 * 상수는 문맥을 재공한다.
 * 만약 매직 넘버로 찍혀 있다면 두 번 세 번 생각해야 되는 이슈가 발생할 수 있다.
 */