import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {

//        TheInterface i1 = ()->{};
//        System.out.println(i1.getClass().getInterfaces()[0]);
//        TheInterface2 i2 = ()->{};
//        System.out.println(i2.getClass().getInterfaces()[0]);
//
//        new Thread(() ->{
//            System.out.println("hello world");
//        }).start();
//
//        new Thread(()-> {
//            System.out.println("hello pepople");
//        }).start();
//
//        new Thread(()->{
//            System.out.println("hello myLove");
//        }).start();
      List<String> list = Arrays.asList("hello","world","hello world");
//        list.forEach(str ->{
//            System.out.println(str.toUpperCase());
//        });

        List<String> list1 = new ArrayList<>();
        list.forEach(str ->list1.add(str.toUpperCase()));
        list1.forEach(str-> System.out.println(str));
//        list.stream().map(str ->str.toUpperCase()).forEach(str -> System.out.println(str));
        list.stream().map(String::toUpperCase).forEach(item-> System.out.println(item));
    }
}


@FunctionalInterface
interface TheInterface{

    void myMethod();
}
@FunctionalInterface
interface TheInterface2{
    void  myMethod2();
}

