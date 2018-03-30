abstract public class Supertip {

  int value;

  abstract public Supertip add(Supertip b);

  abstract public Supertip multiply(Supertip b);

  abstract public boolean testType(Supertip b);

  abstract public boolean checkMe();

  public final boolean equals(Supertip b) {
    if(this.value == b.value)
      return true;
    else return false;
  }

  private int repeat(int v1){
    int v2 = v1;
    int x=0;
    while(v2>0) {
      x += v2 % 10;
      v2 /= 10;
    }
    return x;
  }

  public final int controlDigit() {
      int x = this.value;

      while (x >= 10) {
          int sum = 0;
          while (x != 0) {
              sum += x % 10;
              sum /= 10;
          }
          x = sum;
      }

      return x;
  }

  public final boolean controlEquals(Supertip b) {
      if (this.controlDigit() == b.controlDigit())
          return true;
      else return false;
  }
}