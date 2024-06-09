package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();

        musicPlayer.volumeDown();
        musicPlayer.showStatus();

        musicPlayer.off();
    }
}

/**
 * 음악 플레이어를 만들고 기능만 호출해서 온전하게 사용할 수 있게 되었다 !!
 * 갖다 쓰는 입장에서는 코드를 몰라도 됨
 *
 * 속성과 기능을 하나로 묶어 필요한 기능들을 외부로 노출시키는 것을 캡슐화 라고 한다!!
 *
 * 뭐가 들어 있는 지는 알지 못한다!!
 *
 * MusicPlayer를 변경 할 때 다른 코드를 변경하지 않아도 된다!!
 * volume?? MusicPlayer에서만 바꾸면 됨!!
 */


/**
 * 속성(메개 변수)와 기능(메서드)가 온전히 하나로 뭉쳐져 있다. << 이것이 가장 중요하다
 *
 *
 * 객체 지향에서는 어떤 절차로 프로그램을 구현하는 것 보다
 * 객체 자체 << 뮤직 플레이어라는 객체 자체를 어떻게 만들지 고민하는 것이 더 중요하다!!
 *
 * 새상의 모든 사물을 단순하게 추상화 해보면 속성과 기능으로 추출할 수 있다!
 */