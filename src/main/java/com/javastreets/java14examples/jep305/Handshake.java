package com.javastreets.java14examples.jep305;

public class Handshake extends Greet {

  public String extendHand() {
    throw new IllegalArgumentException(
        "Access to hands is not allowed. It is unsafe and could spread COVID-19!");
  }

}
