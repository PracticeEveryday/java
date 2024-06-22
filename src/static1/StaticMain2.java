package static1;

public class StaticMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("counter.value = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("counter.value = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("counter.value = " + counter.count);
    }
}

/**
 * count 값은 Data2와 관련된 변수인데, 외부의 도움을 받아야 한다.
 *
 * 이를 해결하기 위한 방법이 static이다!
 */