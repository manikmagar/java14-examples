package com.javastreets.java14examples.jep305;

public class PhysicalHandshake extends Greet {

  public String extendHand() {
    throw new IllegalArgumentException(
        "Access to hands is not allowed. It is unsafe and could spread COVID-19!");
  }

  public boolean isVirtual() {
    return false;
  }

  public String virtualGreet() {
    return "Virtual Handshake is safe, go for it!";
  }
}
