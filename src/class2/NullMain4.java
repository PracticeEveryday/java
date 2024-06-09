package class2;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();

        System.out.println("bigData.data: " + bigData.data);
        System.out.println("bigData.count: " + bigData.count);

        // NullPointerException
        // null 값에 `.` << access operator 연산자를 사용하면 발생하는 에러라고 생각하면 쉽다.
        System.out.println("bigData.data.value: " + bigData.data.value);
    }
}
