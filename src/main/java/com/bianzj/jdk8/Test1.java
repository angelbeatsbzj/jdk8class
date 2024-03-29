package com.bianzj.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println("--------------------------");
//        for (Integer integer : list) {
//            System.out.println(integer);
//
//        }
//        System.out.println("===========================");
        list.forEach(new Consumer<Integer>() {
                         @Override
                         public void accept(Integer integer) {
                             System.out.println(integer);
                         }
                     });
        System.out.println("------------------------");
        list.forEach(integer -> System.out.println(integer));

        System.out.println("-----------------------");
        list.forEach(System.out::println);//通过方法引用创建函数式接口 method reference

    }
}
