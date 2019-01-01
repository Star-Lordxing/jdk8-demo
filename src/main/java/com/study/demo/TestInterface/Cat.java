package com.study.demo.TestInterface;

import java.util.function.Supplier;

public class Cat  implements Animal {

    private static class Dog implements Animal {
         @Override
         public String getName(){
            return "dog";
        }
    }

    private interface AnimalFactory {
        // Interfaces now allow static methods
        static Animal create( Supplier<Animal> supplier ) {
            return supplier.get();
        }
    }

    public static void main(String[] args) {
        Animal dog = AnimalFactory.create(Dog::new);
        Animal cat = AnimalFactory.create(Cat::new);
        System.out.println(dog.getName());
        System.out.println(cat.getName());
    }


}
