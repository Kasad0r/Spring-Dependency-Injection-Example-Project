package kasad0r.dispring;

import kasad0r.dispring.cotrollers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);

        System.out.println("--- The Best Pet is ---");

        System.out.println(petController.whichPetIsTheBest());


        I18nController i18nController = (I18nController) ctx.getBean("i18nController");

        System.out.println(i18nController.sayHello());

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println("----- Primary");

        System.out.println(controller.sayHello());

        System.out.println("----- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----- Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----- Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());


    }

}
