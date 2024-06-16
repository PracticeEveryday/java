// .을 통해서 하위라는 것을 구분한다.
package pack.a;

public class User {
    // public을 넣은 이유: 다른 패키지에서 이 생성자를 호출하기 위해서는 Public 이라는 접근 제어자가 필요하다!!!
    public User() {
        System.out.println("패키치 pack.a 내 유저 생성");
    }
}
