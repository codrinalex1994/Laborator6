public class PalindromNumber extends Supertip {

    public PalindromNumber(double value) {
        this.value = value;
    }

    public void add(Supertip b) {
        this.value += b.value;
    }
    public void multiply(Supertip b) {
        this.value *= b.value;
    }
    public void testType(Supertip b) {

    }
    public void checkMe() {
        int aux = (int)value;
        boolean valid = true;
        boolean mountain;

        int firstDigit = aux % 10;
        aux /= 10;
        int secondDigit = aux % 10;
        if(firstDigit < secondDigit)
            mountain = true;
        else
            mountain = false;

        boolean firstHalf = true;
        int previousDigit = secondDigit;
        while(aux > 0) {
            int currentDigit = aux % 10;
            aux /= 10;
            if(mountain) {
                if(previousDigit < currentDigit) {
                    if(firstHalf) {
                        firstHalf = false;
                        mountain = false;
                    }
                    else {
                        //return false;
                    }
                }
            } else {
                if(previousDigit > currentDigit) {
                    if(firstHalf) {
                        firstHalf = false;
                        mountain = true;
                    }
                    else {
                        //return false;
                    }
                }
            }
        }
        //return true;
    }
}