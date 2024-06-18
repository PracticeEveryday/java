package access.b;

// import access.a.DefaultClass1;  // public 이 아니기 때문에 import 가 안된다!!
// import access.a.DefaultClass2;

import access.a.PublicClass;

public class PublicOuterMain {
    public static void main(String[] args) {
        // ✅ public class는 접근이 가능하다!
        PublicClass publicClass = new PublicClass();

        // DefaultClass1 defaultClass1 = new DefaultClass1();
        // DefaultClass2 defaultClass2 = new DefaultClass2();

    }
}
