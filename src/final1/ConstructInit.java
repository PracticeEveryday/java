package final1;

public class ConstructInit {
    final int value;

    public ConstructInit(int value) {
        this.value = value; // 클래스의 final 멤버 변수는 construct 를 통해서만 할당 할 수 있다.
    }
}
