package access;

public class SpeakerMain {
    public static void main(String[] args) {
        System.out.println("Speaker on!");

        Speaker speaker = new Speaker();

        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeDown();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();

        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volum = 200;
        speaker.setVolume(200);
        speaker.showVolume();
    }
}
