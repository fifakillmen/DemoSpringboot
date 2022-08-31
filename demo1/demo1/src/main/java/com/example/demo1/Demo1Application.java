package com.example.demo1;

import com.example.demo1.model.Girl;
import com.example.demo1.model.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext contex = SpringApplication.run(Demo1Application.class, args);
        Outfit outfit = contex.getBean(Outfit.class);
        System.out.println("Intstance: " + outfit);
        outfit.wear();
        Girl girl = contex.getBean(Girl.class);
        System.out.println("girl instance: " + girl);
        System.out.println("outfit: " + girl.getOutfit());
        girl.getOutfit().wear();

    }


}
