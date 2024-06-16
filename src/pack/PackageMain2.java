package pack;

// 내 package 경로가 나온 뒤 임포트 할 패키지의 경로가 나오면 된다.
//import pack.a.User;
//import pack.a.User2; // 이렇게 개별로도 쓸 수 있고

import pack.a.*; // 아스타리카를 사용하여 전부 다 가져올 수도 있따!

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
    }
}
