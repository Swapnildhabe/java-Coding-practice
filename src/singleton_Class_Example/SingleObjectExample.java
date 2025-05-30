package singleton_Class_Example;

class SingleObjectClass {
        static SingleObjectClass instance = null;
    private SingleObjectClass (){
        System.out.println("SingleObject constructor called");
    }
    public static SingleObjectClass getInstance(){
        if(instance==null){
            return instance = new SingleObjectClass();
        }
        return instance;
    }

}
public class SingleObjectExample{
    public static void main(String[] args) {
        SingleObjectClass s1 = SingleObjectClass.getInstance();
        System.out.println(s1);
        SingleObjectClass s2 = SingleObjectClass.getInstance();
        System.out.println(s2);
        SingleObjectClass s3 = SingleObjectClass.getInstance();
        System.out.println(s3);
    }
}