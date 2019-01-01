package com.study.demo;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        Integer[] strArray1 = Stream.of(1,2,4,3).toArray(Integer[]::new);
        System.out.println(Arrays.stream(strArray1).mapToInt(Integer::intValue).max().getAsInt());

        Stream.of("a324 fgdf dfdgf","dfdgf","s","v").parallel()
                .flatMap(line -> Stream.of(line.split(" "))).filter(word -> word.length()>0)
                .map(String::toUpperCase).distinct().sorted((x1,x2) -> x2.compareTo(x1)).collect(Collectors.toList())
                .forEach(System.out::println);

        Stream.generate(() -> new Random().nextInt()).limit(20).forEach(System.out::println);

        Map<Boolean, List<Integer>> map = Stream.generate(()-> new Integer(new Random().nextInt())).limit(10)
                .collect(Collectors.partitioningBy(x -> x>0));

        map.forEach((aBoolean, integers) -> System.out.println(aBoolean+":"+integers));


    }
}
