package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("PublicMethod 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("DefaultMetohd 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("PrivateMethod 호출 " + privateField);
    }

    public void innerAccess () {
        // 내부에서는 모든 접근 제어자 호출 가능!!
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
