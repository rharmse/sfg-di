package net.scipher7.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("AF")
@Service("i18nService")
public class I18nAfrikaansGreetingService implements GreetingService{

  @Override
  public String sayGreeting() {
    return "Hallo daar!";
  }
}
