package net.scipher7.sfgdi;

import net.scipher7.sfgdi.controllers.ConstructorInjectedController;
import net.scipher7.sfgdi.controllers.I18nController;
import net.scipher7.sfgdi.controllers.MyController;
import net.scipher7.sfgdi.controllers.PropertyInjectedController;
import net.scipher7.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("---I18N Greeting");
		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		System.out.println("---Priamry Bean");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("---Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}
