package com.javastreets.java14examples.jep305;

public class Namaste extends Greet {

  @Override
  public void greet() {
    System.out.println("Namaste");
  }

  public String joinHands() {
    return "Join your own hands! It helps to prevent COVID-19!";
  }
}
