package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrade = {80, 90, 100};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i]);
        }
    }

    // 이제는 각 배열에 값만 추가하면 변수를 선언하거나 출력문을 추가할 필요는 없다.
    // 배열 사용의 한계 << 한 명의 변수가 세 개의 변수로 쪼개져 있다.
    // 데이터를 변경할 때 엄청 조심해야함.

    // 학생 2번을 제거하기 위해서는 학생 2번 인덱스에 존재하는 각 배열에서 삭제해야 하는 이슈가 있다.
    // 컴퓨터 입장에서는 배열로 나눠 관리하는 게 상관없다.

    // 사람이 관리하는 데 문제가 있는 것이다!
    // 학생의 개념을 하나로 묶어 관리하는 것이 인간에게는 더 좋다!!
    // 클래스로 학생이라는 개념을 만들어 버리자!
}
