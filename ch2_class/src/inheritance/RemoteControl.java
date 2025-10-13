package inheritance;

public interface RemoteControl {

    // 상수
    static final int MAX_VOLUME = 10;
    static final int MIN_VOLUME = 0;

    // 추상메소드
    abstract void turnOn();

    abstract void turnOff();

    abstract void setVolume(int volume);

    // 일반메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("음소거");
        } else {
            System.out.println("음소거 헤제");
        }
    }

    static void changeBattery() {
        System.out.println("건전지 교체");
    }
}
