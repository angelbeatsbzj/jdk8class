package com.bianzj.jdk8;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
//        System.out.println(test.compare(1,value->{return  2 * value;}));
//        System.out.println(test.compare(2,value->5+value));
//        System.out.println(test.compare(3,value->value * value));
//
//        System.out.println(test.convert(5,value->String.valueOf(value)+" helloworld"));
        Function<Integer,Integer> function = value ->{
            value=value+5;
            return value * value;
        };
        System.out.println(test.compare(2,function));
    }
    public  int compare(int a, Function<Integer,Integer> function){
        int result = function.apply(a);
        return  result;
    }

    public String convert (int a,Function<Integer,String> function){
        return function.apply(a);
    }
}
