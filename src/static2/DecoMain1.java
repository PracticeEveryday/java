package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";

        // instance 를 생성해야 함!
        // instance 생성 의미가 없음..
        DecoUtil decoUtil = new DecoUtil();
        String deco = decoUtil.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
