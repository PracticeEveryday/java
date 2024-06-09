package class2;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = " + dataA.value); // 20
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = " + dataB.value); // 30
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value);// 30
    }
}


// 실제 인스턴스는 하나임
// value는 기본형 변수임

// 자바에서 대입은 변수에 들어있는 값을 읽고 `복사`해서 대입한다!!!!!!! << 중요
// 통안에 있는 값을 복사해 전달할 뿐이다.
// 변수가 가리키는 인스턴스가 복사되는 것이 아니라 변수에 포함된 참조 값만 바뀐다!!!

// 같은 인스턴스를 바라보게 되어 객체가 바뀌면 참조를 통해 접근하는 값도 바뀌어있다!!