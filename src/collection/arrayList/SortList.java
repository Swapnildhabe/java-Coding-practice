package collection.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(50);
        list.add(20);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
