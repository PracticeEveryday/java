package static1;

public class Data2 {
    String value;
    Data2(String value, Counter counter) {
        this.value = value;
        counter.count = counter.count + 1;
    }
}
