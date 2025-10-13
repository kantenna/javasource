package exam;

public class Won2Dollar extends Converter {

    @Override
    protected double convert(double src) {
        double val = src / 1200;
        return val;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }

}
