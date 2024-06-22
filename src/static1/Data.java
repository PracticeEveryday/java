package static1;

public class Data {
    public String name;
    public int count;

    /**
     * 인스턴스를 생성하면 인스턴스가 몇 개 생성되었는 지 확인하는 변수를 만들고 싶다.
     */
    Data (String name) {
        this.name = name;
        this.count++;
    }
}
