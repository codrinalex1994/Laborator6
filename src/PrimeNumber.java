public class PrimeNumber extends Supertip {

    public boolean checkMe() {

    }


    public PrimeNumber(int x) {
        if(!checkIfPrime(x)) {
            throw new RuntimeException("number is not prime");
        }

        this.value = x;
    }

    public Supertip add(Supertip b) {
        if(!checkIfPrime(b.value)) {
            throw new RuntimeException("parameter is not prime");
        }
        if(!checkIfPrime(this.value + b.value)) {
            throw new RuntimeException("sum is not prime");
        }

        this.value += b.value;
    }

    public Supertip multiply(Supertip b) {
        if(!checkIfPrime(b.value)) {
            throw new RuntimeException("parameter is not prime");
        }
        if(!checkIfPrime(this.value * b.value)) {
            throw new RuntimeException("product is not prime");
        }

        this.value *= b.value;
    }

    public int controlDigit() {
        int x = this.value;

        while(x >= 10) {
            int sum = 0;
            while(x != 0) {
                sum += x % 10;
                sum /= 10;
            }
            x = sum;
        }

        return x;
    }

    public void controlEquals(Supertip b) {
    }
}