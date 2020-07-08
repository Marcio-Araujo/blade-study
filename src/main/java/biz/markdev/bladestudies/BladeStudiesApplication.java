package biz.markdev.bladestudies;

import biz.markdev.bladestudies.controller.GreetingsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BladeStudiesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(BladeStudiesApplication.class, args);
        GreetingsController controller = (GreetingsController) ctx.getBean("greetingsController");

        System.out.println(controller.getMessage());
    }

}
