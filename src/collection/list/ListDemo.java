package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element1");  //0
        list.add("Element5");  //1
        list.add("Element4");  //2
        list.add("Element2");  //3
        list.add("Element3");  //4

        System.out.println(list);

//        list.forEach((ele)->{
//            System.out.println(ele);
//        });
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
    }

}
//for(int i=0; i<arr.length; i++)
//
//      int arr [] = new int[10]:
//    arr.add(1);
//    arr.add(2);
//    arr.add(3);
//    arr.add(4);
//    arr.add(5);
//    arr.add(6);
//    arr.add(7);
//    if(4 = arr[i])






