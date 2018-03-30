abstract public class Supertip {

  double value;

  abstract public void add(Supertip b);

  abstract public void multiply(Supertip b);

  abstract public void testType(Supertip b);

  abstract public void checkMe();

  public final boolean equals(Supertip b) {
    if(this.value == b.value)
      return true;
    else return false;
  }

  public final double controlDigit(double value) {
    return 0;
  }

  public final boolean controlEquals(Supertip b) {
    if(controlDigit(this.value) == controlDigit(b.value))
        return true;
    else return false;
  }

}