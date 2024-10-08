public class Parallel extends Circuit {
    private Circuit a;
    private Circuit b;

    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    public double getTotalResistance() {
        return 1/((1/this.a.getResistance()) + (1/this.b.getResistance()));
    }
}
