package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 키기
        player.on();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 감소
        player.volumeDown();

        // 음악 플레이어 상태
        player.showStatus();

        // 음악 플레이어 끄기
        player.off();
    }
}
