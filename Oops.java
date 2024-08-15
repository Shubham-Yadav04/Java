import java.util.*;



// example of covariant return type method overriding valid upto java 5 in this we can override a method of superclass by changing the return type in subclass such that the return type of subclass should be a subclass od parent method return type
class A{
    List hello(){

        return null;

    }
    A(){
        System.out.println("hey its A");
    }
}
class B extends A{
    B(){

        System.out.println("hey its B");
    }
    @Override
    ArrayList hello(){

        return null;

    }
}

public class Oops {
    public static void main(String []args){
        A a= new A();
        B b= new B();
//        a.hello();
//        b.hello();

    }


}
