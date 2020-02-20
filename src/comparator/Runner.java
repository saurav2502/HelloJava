package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Laptop>lst = new ArrayList<>();
        lst.add(new Laptop("Acer",12,1200));
        lst.add(new Laptop("Apple",8,1400));
        lst.add(new Laptop("Dell",16,800));
        Comparator comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop l1, Laptop l2) {
                if (l1.getPrice() > l2.getPrice())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(lst,comparator);
        lst.stream()
                .forEach(System.out::println);
    }
}
