package principles.solid_one.d;

public class Windows98Machine {

  private final StandardKeyboard keyboard;
  private final StandardMonitor monitor;

  /*
  Here we can not pass NormalKeyboard and NormalMonitor.
   */

  public Windows98Machine() {

    monitor = new StandardMonitor();
    keyboard = new StandardKeyboard();

  }

}
