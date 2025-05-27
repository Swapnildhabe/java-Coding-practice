package inhereturns;

class A {
    public A(){
            super();
            System.out.println("A class Constructor called..");
    }
    public void add(){
        System.out.println("A class method called");
    }
}
class B extends A{
    public B(){
        System.out.println("B class Constructor called..");
    }
    public void aclass(){
        System.out.println("B class method called");
    }
}


public class ConstructorinheritanceTest {
    public static void main(String[] args) {
        A b = new B();
         b.add();
        ((B)b).aclass();
        String name = "Swapnil";

        name.equals("Swapnil");
        b.equals(b);
    }
}
