package construct;

public class MemberConstruct1 {
    public static void main(String[] args) {
        // 메모리를 할당하여 MemberConstruct를 만듦과 동시에 같은 이름을 가지는 생성자 함수를 호출해준다!!
        // 그래서 이름이 같을 지도
        MemberConstruct member1 = new MemberConstruct("user1", 15, 80); // () 괄호 오퍼레이터가 있는 이유도 생성자를 호출하기 위함에다!!
        MemberConstruct member2 = new MemberConstruct("user2", 16, 90);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: "  + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
