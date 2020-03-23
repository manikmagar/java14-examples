package com.javastreets.java14examples.jep305;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class JEP305PatternMatchingInstanceOfTest {

  @Test
  void greetingMessageHandshake() {
    PhysicalHandshake hs = new PhysicalHandshake();
    Assertions.assertThrows(IllegalArgumentException.class,
        () -> JEP305PatternMatchingInstanceOf.greetingMessage(hs),
        "Access to hands is not allowed. It is unsafe and could spread COVID-19!");
  }

  @Test
  void greetingMessageNamaste() {
    Namaste nm = new Namaste();
    Assertions.assertEquals(JEP305PatternMatchingInstanceOf.greetingMessage(nm),
        "Join your own hands! It helps to prevent COVID-19!");
  }

  @Test
  void greetingMessageHandshake14() {
    PhysicalHandshake hs = new PhysicalHandshake();
    Assertions.assertThrows(IllegalArgumentException.class,
        () -> JEP305PatternMatchingInstanceOf.greetingMessage14(hs),
        "Access to hands is not allowed. It is unsafe and could spread COVID-19!");
  }

  @Test
  void greetingMessageNamaste14() {
    Namaste nm = new Namaste();
    Assertions.assertEquals(JEP305PatternMatchingInstanceOf.greetingMessage14(nm),
        "Join your own hands! It helps to prevent COVID-19!");
  }

  @Test
  void greetingMessageVirtual() {
    Handshake hs = new Handshake();
    Assertions.assertEquals(JEP305PatternMatchingInstanceOf.greetingMessageVirtual(hs),
        "Virtual greet is always safe!");
  }

  @Test
  void greetingMessage14VirtualOnly() {
    PhysicalHandshake phs = new PhysicalHandshake();
    Assertions.assertEquals(JEP305PatternMatchingInstanceOf.greetingMessage14VirtualOnly(phs),
        "Virtual greet is always safe!");
  }
}
