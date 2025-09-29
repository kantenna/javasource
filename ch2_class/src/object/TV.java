package object;

public class TV {
    // 속성 : 크기(52), 채널(7), 전원(true/false), 색상(black)
    int size;
    int channel;
    boolean power;
    String color;

    // 생성자
    public TV() {
    }

    // 기능 : 채널변경, 전원여부, 볼륨조절
    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]";
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void channelUp() {
        ++this.channel;
    }

    public void channelDown() {
        --this.channel;
    }

    public int getSize() {
        return size;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isPower() { // boolean 타입은 getter 메소드가 is로 만들어진다.
        return power;
    }

    public String getColor() {
        return color;
    }

}
