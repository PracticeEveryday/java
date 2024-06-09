package class2;

public class initMain {
    public static void main(String[] args) {
        InitData initData = new InitData(); // new로 해주는 것은 인스턴스를 만들면서 초기값 세팅을 해준다!!
        System.out.println("value: " + initData.value1);    // 초기화 안 한 값: 0
        System.out.println("value1: " + initData.value2);   // 초기화 한 값: 10
    }
}
