package class2;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // 참조형 변수 Data를 만들었는데 Null을 할당했다 -> 아직 가리키고 있는 객체가 없다는 뜻이다.
        System.out.println("data : " + data); // null

        data = new Data(); // 이제 가리킬 객체의 주소가 생성되었다
        System.out.println("data : " + data); // 30f39991 << 참조값 생김

        data = null; // 이제는 앞에 생성한 Date 객체의 주소를 참조하지 않게 된다.
        System.out.println("data : " + data); // null

        // 생성된 Data 객체 30f39991 는 어떻게 될까?
        // GC가 더 이상 참조하고 있지 않다고 판단하여 힘 메모리에서 제거한다.
        // 왜?? 30f39991 << 이 주소 값을 알고 있는 애는 아무도 없다! 즉, 이제 아무도 접근할 수가 없게 되는 것이다.
        // 아무도 사용하지 않으면 메모리 용량만 차지하고 있고 낭비가 생성된다.


        // 🤔우리가 생성하고 삭제하는 게 더 빠른 거 아니야?

        // 만약 생성하는 변수마다 메모리에서 제거해주는 명령어를 작성하게 되면 삭제하는 메소드가 너무 많아진다.
        // 하지만 자바는 여러개의 첨조하지 않는 객체들을 모아서 적정량을 한번에 처리한다. << 오히려 더 우수한 성능을 발산할 수도 있다.

        // 더해서, 자바 언어의 가비지 컬렉션을 만드는 사람은 상당히 뛰어난 사람이 만든다.
        // 만들어 줌에 감사함을 느끼자 :)
    }
}
