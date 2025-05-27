package ArrayExample;

import java.util.ArrayList;
import java.util.List;

interface A {
    default void display(){
        System.out.println("Inside A interface Display Method ");
    }

     Object show();
}

interface B {

//    default void display(){
//        System.out.println("Inside A interface Display Method ");
//    }
    Object show();
}

public class MultipleImpliment implements A, B {

   MultipleImpliment a = new MultipleImpliment();




    // Only one implementation needed
    public String  show() {
        System.out.println("Showing from MyClass");
        return null;
    }

    public static void main(String[] args) {
        MultipleImpliment obj = new MultipleImpliment();
        List<String> name = new ArrayList<>();

        // Can call directly
        obj.show();

        // Or via interface reference
        A a = obj;
        a.show();

        B b = obj;
        b.show();
    }
}