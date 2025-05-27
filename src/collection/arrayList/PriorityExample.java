package collection.arrayList;

import javax.crypto.spec.PSource;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityExample {
    public static void main(String[] args) {
        Queue<Integer> ps = new PriorityQueue<>();
        ps.add(9);
        ps.add(5);
        ps.add(8);
        ps.add(2);
        ps.add(7);

        System.out.println(ps);

    }
}
