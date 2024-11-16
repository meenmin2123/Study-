package access;

public class Speaker {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다." + volume);
        }
    }

    void volumeDown() {

        volume -= 10;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
