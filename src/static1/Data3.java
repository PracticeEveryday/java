package static1;

public class Data3 {
    public String name;
    public static int count;

    Data3(String name){
        this.name = name;
        count++;    // 내것은 생략 할 수 있다. Data3.count++ 해도 된다!
    }
}


/**
 * static 은 결국 Class에서 관리하는 변수이다.
 * 클래스는 하나 밖에 존재하지 않는다. << 즉, 공용 변수인 것!
 */