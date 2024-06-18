package access;

public class Speaker {
    private int volume; // Speaker 클래스 안에서만 접근이 가능하게 됨.

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(this.volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + this.volume);
    }
}


/**
 * 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.
 *
 * 1. private 는 나의 클래스 안으로 속성과 기능을 숨길 떄 사용
 * 2. default 는 나의 패키지 안으로 속성과 기능을 숨길 떄 사용
 * 3. protected 는 상속 관계로 속성과 기능을 숨길 떄 사용
 * 4. public 은 기능을 숨기지 않고 어디서든 다 사용하게 할 떄 사용
 *
 * private -> default -> protected -> public 순으로 엄격다.
 */