abstract public class Supertip {

  int value;

  abstract public Supertip add(Supertip b);

  abstract public Supertip multiply(Supertip b);

  abstract public Supertip testType(Supertip b);

  abstract public boolean checkMe();

  public final boolean equals(Supertip b) {
    if(this.value == b.value)
      return true;
    else return false;
  }

  public final int controlDigit(double value) {
    return 0;
  }

  public final boolean controlEquals(Supertip b) {
    if(controlDigit(this.value) == controlDigit(b.value))
        return true;
    else return false;
  }

}