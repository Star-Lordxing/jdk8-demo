package com.study.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        TestLamda();
    }

    public static void TestLamda(){
        String separator = ",";
        Arrays.asList("a","g","c").forEach((String e) -> {
            System.out.print(e + separator);
            System.out.println(e);
        });
    }

    public static void TestLamdaNoReturn(){

    }


}
