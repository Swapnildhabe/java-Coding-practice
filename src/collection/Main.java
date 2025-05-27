package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Main<T> {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        boolean ans = fruitCollection.add("sam");
        System.out.println(ans);

        fruitCollection.add("Banana");
        fruitCollection.add("apple");
        fruitCollection.add("Mango");
        System.out.println(fruitCollection );

//        fruitCollection.remove("apple");
//        System.out.println(fruitCollection);

//        fruitCollection.forEach((element)->{
//            System.out.println(element);
//        });

        fruitCollection.forEach((sammu)->{
            System.out.println(sammu); // java 8
        }
        );



    }
}
//-----------------------------------
//
//class Box<T> {
//    private T value;
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//
//    public T getValue() {
//        return value;
//    }
//}
//Box<Integer> intBox = new Box<>();
//intBox.setValue(100);
//Integer num = intBox.getValue();  // No casting needed
//----------------------------------------
//
//List<T> names = new ArrayList<>();
//names.add("Swapnil");
//names.add(10); // ❌ Compile-time error
//
//String name = names.get(0); // No cast needed
//






