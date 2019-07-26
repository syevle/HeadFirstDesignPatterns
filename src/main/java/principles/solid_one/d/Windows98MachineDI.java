package principles.solid_one.d;

public class Windows98MachineDI {

  private final Keyboard keyboard;
  private final Monitor monitor;

  /*
  Here we can pass both normal and standard monitor and keyboard.
   */
  public Windows98MachineDI(Keyboard keyboard, Monitor monitor) {
    this.keyboard = keyboard;
    this.monitor = monitor;
  }
}
