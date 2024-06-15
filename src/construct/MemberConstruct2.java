package construct;

public class MemberConstruct2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 80); // () 괄호 오퍼레이터가 있는 이유도 생성자를 호출하기 위함에다!!

        // 생성자 오버로딩이 됨 << 즉, 개발자가 정의한 생성 자 중 올바른 것을 찾아 실행해준다.
        // 즉 생성자를 이용하여 인스턴스를 생성할 때 성적이 필요하다면 위 생성자를, 성적 데이터가 필요 없다면 아래와 같이 생성자를 호출하면 된다.
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: "  + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
