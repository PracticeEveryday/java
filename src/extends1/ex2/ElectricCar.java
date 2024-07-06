package extends1.ex2;

/**
 * 자식은 상속 받는 부모의 위치를 알고 있다.
 *
 * 즉, 화살표는 자식 쪽에서 부모 쪽으로 가리키게 된다.
 * 화살표는 내가 상대방을 안다는 뜻을 가지고 있다.
 * ElectricCar -> Car
 */
public class ElectricCar extends Car{
    public void charge() {
        System.out.println("차를 충전합니다.");
    }
}

/**
 * 상속은 단일 상속만 가능하다!
 * 다중 상속은 자바에서 지원되지 않는다.
 */