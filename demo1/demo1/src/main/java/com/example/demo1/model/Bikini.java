package com.example.demo1.model;

import org.springframework.stereotype.Component;

@Component
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("Bikinied");
    }
}
