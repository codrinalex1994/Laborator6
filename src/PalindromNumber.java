public class PalindromNumber extends Supertip {

    public PalindromNumber(int value) {
        this.value = value;
    }

    public Supertip add(Supertip b) {
        this.value += b.value;
        return this;
    }
    public Supertip multiply(Supertip b) {
        this.value *= b.value;
        return this;
    }
    public boolean testType(Supertip b) {
        return  true;
    }
    public boolean checkMe() {
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
                        return false;
                    }
                }
            } else {
                if(previousDigit > currentDigit) {
                    if(firstHalf) {
                        firstHalf = false;
                        mountain = true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}