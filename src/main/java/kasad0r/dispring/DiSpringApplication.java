package kasad0r.dispring;

import kasad0r.dispring.cotrollers.ConstructorInjectedController;
import kasad0r.dispring.cotrollers.MyController;
import kasad0r.dispring.cotrollers.PropertyInjectedController;
import kasad0r.dispring.cotrollers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        String greeting = controller.sayHello();

        System.out.println(greeting);

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
