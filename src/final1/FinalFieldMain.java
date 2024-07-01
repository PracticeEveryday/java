package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");

        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);

        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit(10);
        FieldInit fieldInit2 = new FieldInit(20);
        FieldInit fieldInit3 = new FieldInit(20);

        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value); // fianl 값을 못 바꿈

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);// 상수는 static // 클래스를 통해 접근 가능하다
    }
}
