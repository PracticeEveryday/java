package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태");
        if(isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else  {
            System.out.println("음악 플레이어 OFF");
        }
    }
}


/**
 * 실제로 음악 플레이어에게 필요산 속성과 메소드를 정의했다!
 *
 * 이제 음악 플레이어가 필요한 곳에서 이 클래스를 호출한다면 온전한 음악 플레이어를 사용할 수 있게 된다.
 */