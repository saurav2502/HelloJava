package java8;

import java.util.Arrays;
import java.util.List;

interface Lambda{
    void show(int i);
}

public class LambdaDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.forEach(integer -> System.out.println(integer));
        Lambda obj = i -> System.out.println("hi "+i);
        obj.show(7);

    }
}
