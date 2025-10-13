package exam;

public abstract class OddDetector {
    private int n;

    public OddDetector(int n) {
        this.n = n;
    }

    public abstract boolean idOdd();

    public int getN() {
        return n;
    }
}
