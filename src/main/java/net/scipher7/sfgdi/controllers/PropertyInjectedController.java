package net.scipher7.sfgdi.controllers;

import net.scipher7.sfgdi.services.GreetingService;

public class PropertyInjectedController {
  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
