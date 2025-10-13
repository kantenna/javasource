package exam;

public class IPTV extends ColorTV {

    private String ip;

    public IPTV(int size, int color, String ip) {
        super(size, color);
        this.ip = ip;
    }

    @Override
    public void printProperty() {
        System.out.printf("나의 IPTV는 %s 주소의 ", this.ip);
        super.printProperty();
    }

}
