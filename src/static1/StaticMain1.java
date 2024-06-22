package static1;

public class StaticMain1 {
    public static void main(String[] args) {
        Data data = new Data("A");
        System.out.println("data.count = " + data.count);

        Data data2 = new Data("B");
        System.out.println("data.count = " + data2.count);

        Data data3 = new Data("C");
        System.out.println("data.count = " + data3.count);
    }
}
