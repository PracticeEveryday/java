package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();    // 참조형을 final로 바꿈
//        data = new Data(); // 이건 담을 수 없음 참조 대상을 바꿀 수 없음

        // 참조 대상의 값은 변경이 가능함
        data.value = 10; // 참조 대상의 객체의 값은 바꿀 수 있다!!
        System.out.println(data.value);

        data.value = 20;
        System.out.println(data.value);

    }
}


/**
 * 참조형 변수에 들어 있는 참조형 값 자체를 바꾸지 못하는 것이다.
 * 즉, 변수에 들어있는 주소 값 자체를 바꾸지 못한다는 것!
 *
 * 그렇다면 참조 값이 가지고 있는 다른 맴버 변수 값들은 아무런 영향을 주지 않는다는 말과 같다.
 *
 * 붙은 것만 영향을 주지 인스턴스가 가지는 변수는 아무런 영향을 주지 않는다!!!
 */