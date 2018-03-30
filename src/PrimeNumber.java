public class PrimeNumber extends Supertip {

    public void checkMe() {

    }


    public PrimeNumber(double x) {
        if(!checkIfPrime(x)) {
            throw new RuntimeException("number is not prime");
        }

        this.value = x;
    }

    public Supertip add(Supertip b) {
        if(!checkIfPrime(b)) {
            throw new RuntimeException("parameter is not prime");
        }
        if(!checkIfPrime(this.value + b)) {
            throw new RuntimeException("sum is not prime");
        }

        this.value += b;
    }

    public Supertip multiply(Supertip b) {
        if(!checkIfPrime(b)) {
            throw new RuntimeException("parameter is not prime");
        }
        if(!checkIfPrime(this.value * b)) {
            throw new RuntimeException("product is not prime");
        }

        this.value *= b;
    }

    public double controlDigit() {
        double x = this.value;
        while(x != (int)x) {
            x *= 10;
        }


    }

    public void controlEquals(Supertip b) {
    }
}