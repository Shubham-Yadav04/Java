import java.util.*;
// NOTE-1 : example of covariant return type method overriding valid upto java 5 in this we can override a method of superclass by changing the return type in subclass such that the return type of subclass should be a subclass of
// parent method return type

// NOTE-2 : In case of method overriding the access modifier of child class method should be less restricted than the method of parent class
class A{
    List bye(){// NOTE-1 EX

        return null;

    }
    A(){
        System.out.println("hey its A");
    }
     void hello(){ // NOTE-2 Ex
        System.out.println("hello its A");
    }
}

class B extends A{
    B(){

        System.out.println("hey its B");
    }
    @Override
    ArrayList bye(){//NOTE-1 EX

        return null;

    }
    @Override
    protected void hello(){// NOTE-2 Ex
        System.out.println("hello its B");
    }
}
// concept related to upcasting and downcasting
class parent{
    void hello(){
        System.out.println("hello from the function of parent class ");
    }
    void office(){
        System.out.println("Going to office");
    }
}
class child extends parent{
    @Override
    void hello(){
        System.out.println("hello from the child class ");
    }
    void school(){
        System.out.println("Going to School");
    }

}
interface car{
    int wheels=4;
    void runs();
    private void price(){
        System.out.println("we can define private method in interface and we uses the default method to access them out of the class");
    }
    default void strearing(){
        this.price();// accessing private method of class
        System.out.println("have 1 stearing to control the movement of car");
    }
}
class tata implements car{
//     by default all methods in a interface have access modifiers as public
   public void runs(){
        System.out.println("tata cars are more compatiable on roads ");
    }

//    interface car have one default method stearing in it we can override it but if do not override it than each child of the interface will inherit it as it is.
}


//               Method Overloading concept
class Test {

    // the method overloading only depends on four factor : (function name , no of paremeter ,order of parameter and type of parameter)

//  private static void meth1(int s) throws Exception{}
//     protected final int  meth1(int s ){return 0;}  // both are considered as same method

    void meth1(int x,float y){
        System.out.println("int and long");
    }
    int meth1(float s , int y){
        return y;
    }
    public void m1(long l, int i) {
        System.out.println(("long, int"));
        ;
    }

    public int m1(int i, long l) {
        System.out.println(("int, long"));
    return 0;
    }

    //    Test t = new Test();
//		t.m1(1,1(long));
//      t.m1(1(long,1);
//      t.m1(1,1); //ambigious--->>> provides compile time error


    public void m2(Object o) {
        System.out.println(("object"));
    }

    public void m2(String s) {
        System.out.println(("String"));
    }

    public void m2(StringBuilder s) {
        System.out.println(("StringBuilder"));
    }

//        Test t = new Test();
//        t.m2(new Object());
//        t.m2("Shakti");
//        t.m2(null); //compile time error ambiguous call // AAB ISME STRING OR Stringbuilder ek he stage pr h dono child h
//        to jvm confuse ho jyega kon se wale ko null du to comp excp

    // but agr StringBuilder wala method nhi hota to JVM null value Child Class(String wala function) ko deta inspite of giving it to the function taking parameter of parent class (Object wala function)




}

abstract class Parent1 {
 abstract void hey();
  void hello(){
     System.out.println("hello");
 }
}
interface hello{
     static void hello(){
        System.out.println("hello");
    }

}
class by extends Parent1 implements hello{
    void hey(){
        System.out.println("hey");
    }

}
public class Oops{
    public static void main(String []args){
//        A a= new A();
//        B b= new B();
////        a.hello();
////        b.hello();
//        b.hello();
//
//        parent child1= new child();
//        child child2 = new child();
//child1.hello();
        // it will provide error if we try to  access the method of child which are not in parent if we provide reference of parent class at the time of object creation

//        child1.school() // generates error


//  we can access the methods of both the parent and child if we provide reference of child at the time of object creation
//    child2.office();
//        child2.school();
//
//        tata car1 = new tata();
    //    car.wheels=6; // cannot assign value to the attributes in a interface bcoz they are by default static and final
//car1.strearing(); // we have not overrided it but still child object of tata class can access it bcoz it has  default access modifiers.



//         Anonymous class
//        parent newObj= new parent(){
//            void office(){
//                System.out.println("parent have to go office");
//            }
//            void role(){
//                System.out.println("want role");
//            }
//
//        };
//        newObj.office();
//        newObj.hello();
//    }

        hello parent= new by();

}}
