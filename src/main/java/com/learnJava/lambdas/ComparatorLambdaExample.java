package com.learnJava.lambdas;

import java.util.Comparator;

/**
 * fileName : ComparatorLambdaExample
 * author :  KimSangHoon
 * date : 2022/10/16
 */
public class ComparatorLambdaExample {
    public static void main(String[] args) {

        /**
         * prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> 01==02, 1 -> o1 > o2. -1 -> o1 < o2
            }
        };
        System.out.println("Result of the comparator is : " + comparator.compare(3, 2));

        /**
         * java 8 lambda
         */
//        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {return a.compareTo(b);};
//        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
//        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
        Comparator<Integer> comparatorLambda = Integer::compareTo;

        System.out.println("Result of the comparator using Lambda is : " + comparatorLambda.compare(3, 2));

    }
}
