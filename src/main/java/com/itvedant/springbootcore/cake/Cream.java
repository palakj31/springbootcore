package com.itvedant.springbootcore.cake;

import org.springframework.stereotype.Component;

@Component
public class Cream {
    Cream(){
        System.out.println("\nCream Object Created\n");
    }

    public void getName(){
        System.out.println("Chocolate Cream");
    }
}
