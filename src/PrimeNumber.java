public class PrimeNumber extends Supertip {

    public boolean checkMe() {
        return checkIfPrime(this.value);
    }

    private static boolean checkIfPrime(int value) {
        for(int i = 2; i < value / 2; ++i) {
            if(value % i == 0)
                return false;
        }

        return true;
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

        return new PrimeNumber(this.value + b.value);
    }

    public Supertip multiply(Supertip b) {
        if(!checkIfPrime(b.value)) {
            throw new RuntimeException("parameter is not prime");
        }
        if(!checkIfPrime(this.value * b.value)) {
            throw new RuntimeException("product is not prime");
        }

        return new PrimeNumber(this.value * b.value);
    }


    public boolean testType(Supertip b) {
        return b instanceof PrimeNumber;
    }
}