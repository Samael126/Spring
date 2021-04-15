package Entities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Springfirstprog {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.javarush.info.fatfaggy.animals");
        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}

@Component(" Cat-barsik")
class Cat {

    public String getName() {
        return "Барсик";
    }
}

@Component("Dog-bobik")
class Dog {

    public String getName() {
        return "Бобик";
    }
}

@Component("Parrot-kesha")
class Parrot {

    public String getName() {
        return "Кеша";
    }
}


