package com.study.demo.TestRefernce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Car {
    private String name ="I am a car";

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Car create(final Supplier< Car > supplier ) {
        return supplier.get();
    }

    public static void collide( Car car ) {
        System.out.println( "Collided " + car.toString() );
    }

    public void follow( Car another ) {
        System.out.println( "Following the " + another );
    }

    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }

    public static void main(String[] args) {
        final Car car = Car.create(Car::new);
        final List< Car > cars = Arrays.asList( car ,Car.create(Car::new));

        cars.forEach(Car::collide );
        cars.forEach(Car::repair);

        final Car car1 = Car.create(Car::new);
        car1.name="car 1";
        cars.forEach(car2 -> car2.follow(car1));
    }
}
