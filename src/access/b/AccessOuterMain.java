package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {

        /**
         * 다른 패키지 내에서 접근 제어자 테스트
         */
        AccessData data = new AccessData();

        // public 필드 접근
        data.publicField = 1;
        data.publicMethod();

        // default 접근 제어자 접근
//        data.defaultField = 2; 다른 패키지 이기에 호출이 불가능 하다 access.a vs access.b!!
//        data.defaultMethod();

        // private 접근 제어자 접근 일단 절대 안 됨
//        data.privateMethod(); // error

        // innerAccess는 퍼블릭이라 접근 가능함.
        // 📝 즉 내부 호출로 바뀜 << 모든 필드와 맴버 변수에 접근이 가능해져 버림
        data.innerAccess();
    }
}
