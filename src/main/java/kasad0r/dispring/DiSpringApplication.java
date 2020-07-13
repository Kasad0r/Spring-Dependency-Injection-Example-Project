package kasad0r.dispring;

import kasad0r.dispring.cotrollers.MyController;
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
    }

}
