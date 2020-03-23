package com.javastreets.java14examples.jep305;

public class JEP305PatternMatchingInstanceOf {

  /**
   * Using regular instance of check
   * 
   * @param greet
   * @return
   */
  public static String greetingMessage(Greet greet) {
    greet.greet();
    if (greet instanceof PhysicalHandshake) {
      PhysicalHandshake phs = (PhysicalHandshake) greet;
      return phs.extendHand();
    } else if (greet instanceof Namaste) {
      Namaste nm = (Namaste) greet;
      return nm.joinHands();
    }
    return "Hello";
  }

  /**
   * Using pattern matching for instanceOf - Preview feature of Java 14
   * @param greet @{@link Greet}
   * @return
   */
  public static String greetingMessage14(Greet greet) {
    greet.greet();
    if (greet instanceof PhysicalHandshake phs){
      return phs.extendHand();
    } else if (greet instanceof Namaste nm){
      return nm.joinHands();
    }
    return "Hello";
  }

  static Namaste hs = new Namaste();

  /**
   * Scoping of variables with pattern matching. `hs` on RHS of || is the static variable of this class and not the inline declaration.
   * @param greet
   * @return
   */
  public static String greetingMessage14VirtualOnly(Greet greet) {
    greet.greet();
    if (greet instanceof Handshake hs || hs.isVirtual()){
      return hs.virtualGreet();
    }
    return "Hello";
  }

  /**
   * Scoping of variables with pattern matching - `hs` on RHS of && is same as declared in pattern matching.
   * @param greet
   * @return
   */
  public static String greetingMessageVirtual(Greet greet) {
    greet.greet();
    if (greet instanceof Handshake hs && hs.isVirtual()){
      return hs.virtualGreet();
    }
    return "Hello";
  }

}
