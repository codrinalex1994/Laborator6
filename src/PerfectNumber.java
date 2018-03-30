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

    public final int controlDigit() {
        int sum = 0;
        if(value < 10){
            sum = (int)value;
        }
        while (value > 9)
        {
            while (value > 0) {
                sum += value % 10;
                value /= 10;
            }
            value = sum;
            sum = 0;
        }
        return 0;
    }

    public final boolean controlEquals(Supertip b) {
        if(controlDigit(this.value) == controlDigit(b.value))
            return true;
        else return false;
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