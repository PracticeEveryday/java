package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {

        /**
         * 같은 데이터 패키지 내에서 접근 제어자 테스트
         */
        AccessData data = new AccessData();

        // public 필드 접근
        data.publicField = 1;
        data.publicMethod();

        // default 접근 제어자 접근
        data.defaultField = 2;
        data.defaultMethod();

        // private 접근 제어자 접근
//        data.privateMethod(); // error

        // innerAccess는 퍼블릭이라 접근 가능함.
        // 📝 즉 내부 호출로 바뀜 << 모든 필드와 맴버 변수에 접근이 가능해져 버림
        data.innerAccess();
    }
}
