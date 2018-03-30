public class PrimeNumberTest {
    @org.junit.Test
    public void GivenPrimeNumberWhenAddWithPrimeResultThenAdd() {
        PrimeNumber x = new PrimeNumber(2);
        PrimeNumber y = new PrimeNumber(5);

        assertTrue(x.add(y) == new PrimeNumber(7));
    }
    @org.junit.Test
    public void GivenPrimeNumberWhenAddWithNonPrimeResultThenThrowError() {
        PrimeNumber x = new PrimeNumber(3);
        PrimeNumber y = new PrimeNumber(5);

        try {
            x.add(y);
        }
        catch(Exception e) {
            return;
        }

        assertTrue(false);
    }

    @org.junit.Test
    public void GivenPrimeNumberWhenMultiplyingThenThrowError() {
        PrimeNumber x = new PrimeNumber(2);
        PrimeNumber y = new PrimeNumber(5);

        try {
            x.multiply(y);
        }
        catch(Exception e) {
            return;
        }

        assertTrue(false);
    }

    @org.junit.Test
    public void testType() {
    }

    @org.junit.Test
    public void checkMe() {
    }
}
