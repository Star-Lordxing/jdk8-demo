package com.study.demo.TestInterface;

public interface Animal {

    default String getName(){
        return "animal";
    }
}
