package oop1;

public class MusicPlayer2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        on(data);

        volumeUp(data);
        volumeUp(data);

        volumeDown(data);

        showStatus(data);

        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else  {
            System.out.println("음악 플레이어 OFF");
        }
    }
}


/**
 * 각각의 기능을 메서드로 뽑아내면서 모듈화가 되었다
 * 1. 중복이 제거 되었다.
 * 2. 변경 지점 파악 용이 << 메서드만 변경하면 된다.
 * 3. 메서드 이름 생성 << 메서드의 이름을 통해 더 파악하기 용이해 졌다.
 *
 *
 * 절차지향의 아쉬운 점은
 * 데이터와 기능이 나뉘어져 있다는 것이다.
 *
 * MusicPlayer2 클래스에 기능이 존재한다.
 * MusicPlayerData 클래스에 데이터가 존재한다.
 *
 * 데이터와 데이터를 사용하는 기능은 아주 밀접하게 연관되어 있다.
 * 우리가 작성한 기능을 보면 전부 데이터가 필요로 한다
 *
 * 데이터가 변경되면 메서드도 바뀌어야 한다.
 * 관리 보핑트가 2개로 늘어나게 된다!!.
 */