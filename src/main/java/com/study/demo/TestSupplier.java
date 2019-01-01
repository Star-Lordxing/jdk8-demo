package com.study.demo;

import java.util.function.Supplier;

public class TestSupplier {
    public String name ="1";

    public TestSupplier() {
    }


    public static void main(String[] args) {
        Supplier<TestSupplier> supplier = TestSupplier::new;
        TestSupplier testSupplier = supplier.get();
        testSupplier.name = "2";
        System.out.println(testSupplier.name);


        TestSupplier testSupplier1 = supplier.get();
        System.out.println(testSupplier1.name);

    }


}
