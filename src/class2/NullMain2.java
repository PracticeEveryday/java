package class2;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException
        // . << access operator << 가려고 하는 데 없다??? 야 여기 주소가 없어!!
    }
}
