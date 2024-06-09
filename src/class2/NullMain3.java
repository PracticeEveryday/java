package class2;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.data: " + bigData.data);
        System.out.println("bigData.count: " + bigData.count);

        // NullPointerException
        System.out.println("bigData.data.value: " + bigData.data.value);
    }
}
