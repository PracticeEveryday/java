package final1;

public class FieldInit {
    // 공용 변수인데 바꿀 수 없는 공용 변수가 되어버림!!!
    // 초기 값을 설정한 후에는 바꿀 수 없다!
    // static 은 메모리 영역에서 하나만 존재한다.
    public static final int CONST_VALUE = 10; // JAVA에서 static final이 붙으면 대문자 카멜 케이스로 사용하는 것이 관례이다.


    final int value = 10;

    public FieldInit(int value) {
//        this.value = value; // 초기 값이 있으면 생성자에서 만들어 줄 수 없다 << 컴파일 에러 발생
    }
}
