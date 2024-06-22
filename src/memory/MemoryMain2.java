package memory;

public class MemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");

        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data = new Data(10);
        method2(data);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end");
    }
}


/**
 * 힙 영역 안의 데이터를 아무도 참조하고 있지 않으면 GC의 대상이 된다.
 * 더해서, 외부에서 힙 영역의 데이터를 아무도 참조하고 있지 않지만, 힙 영역 내애서 서로를 참조하는 경우도 GC의 대상이 된다.
 *
 *
 * 지역 변수는 스택 영역에, 객체 인스턴스는 힙 영역에서 관리 된다!!
 */