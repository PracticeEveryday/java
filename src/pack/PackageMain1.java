package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        // 같은 패키지 경로에 있으면 그냥 클래스를 사용하면 된다.
        Data data = new Data();
        // 하지만, 다른 패키지의 클래스를 불러오기 위해서는 해당 패키지 경로를 앞에 다 써주어야 한다.
        pack.a.User user = new pack.a.User();

    }
}
