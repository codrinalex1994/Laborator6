public class PerfectNumber implements Supertip {
    double value;

    PerfectNumber(int value) {
        this.value = value;
    }

    public Supertip add(Supertip s) {
        this.value += s.value;
        return this;
    }

    public Supertip multiply(Supertip s) {
        return (this.value *= s.value)
    }


}