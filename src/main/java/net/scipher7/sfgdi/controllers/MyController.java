package net.scipher7.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  public String doSomething() {
    System.out.println("Hello there!");
    return "I am doing something!";
  }
}
