package ru.gb.homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ProductApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProductConfiguration.class);
        MessageRender messageRender = context.getBean(MessageRender.class);
        messageRender.render();
        context.close();
    }
}
