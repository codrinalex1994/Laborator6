public class PerfectNumber implements Supertip {
    double value;

    PerfectNumber(int value) {
        this.value = value;
    }

    public Supertip add(Supertip s) {
        this.value += s.value;
        return this;
    }

    public Supertip multiply(Supertip s)
    {
        this.value *= s.value;
        return this;
    }

    public boolean testType(Supertip b) {
        if(b.getClass().isInstance(PerfectNumber.class))
            return true;
        return false;
    }


}