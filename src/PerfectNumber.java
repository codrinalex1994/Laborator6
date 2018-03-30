public class PerfectNumber extends Supertip {
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

    public boolean checkMe() {
        int divsorsSum = 0;
        for (int i = 1; i <= this.value / 2; i++) {
            if (this.value % i == 0) {
                divsorsSum += i;
            }
        }
        if (divsorsSum == this.value) {
            System.out.println("It is a perfect number.");
            return true;
        } else {
            System.out.println("It is not a perfect number.");
            return false;
        }
    }


}