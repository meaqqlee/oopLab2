public class Series {
    private Circuit a;
    private Circuit b;

    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    public double getResistance() {
        return this.a.getResistance() + this.b.getResistance();
    }
}
