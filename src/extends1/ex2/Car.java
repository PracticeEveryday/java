package extends1.ex2;

/**
 * 부모 클래스는 자식 클래스에 대해 아는 것이 하나도 없다.
 * 화살표는 내가 상대방을 안다는 뜻을 가지고 있다.
 */
public class Car {
    public void move() {
        System.out.println("차를 이동합니다.");
    }
}


/**
 * 상속과 메모리 구조
 *
 * 1. 상속 관계의 객체를 호출하면, 객체 메모리 내부에는 부모와 자식 이 모드 생성된다.
 * 2. 상속 관계에서 객체를 호출할 시 대상의 타입을 무조건 지정해야 한다. << 호출한 타입을 통해 대상의 타입을 찾는다.
 *    - 부모쪽으로 갈지, 자식 쪽으로 갈지
 * 3. 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아간다. 기능을 못 찾게 되면 `컴파일 에러`가 발생한다.
 */