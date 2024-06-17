package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수행");
        speaker.volume = 200; // volume 에 접근하지 못하게 해야 함 << 100이 넘어가면 터짐 ㅠㅠ..
        // 100을 넘지 못하게 개발해도 아무 소용이 없다.
        // 직접 접근해서 바꾸면 되니까;;

        speaker.showVolume(); // 현재 음량 200
    }
}
