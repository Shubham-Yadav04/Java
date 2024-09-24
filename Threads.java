//import java.io.*;
////// very Light weighted process or we can say the smallest subpart of a process is thread allows the program to execute properly and perform multiple task simultaneously.
////
////// java has  in-built thread such as main thread which executes the program main method and a garbage collectior thread which perform task related garbage cleaning .
////
////// we can create thread by using thread class or by implementing runnable interfacegit
////
////class MyThread extends Thread { // 1. using thread class
////
////    public void run() {
////        for (int i = 0; i < 10; i++) {
//////            try {
//////
//////                wait(1000);
//////            } catch (Exception e) {
//////                System.out.println("I am a thread created by thread class ");
//////            }
////            System.out.println(" method of MyThread1 created using Thread class");
////        }
////    }
////
////}
////class MyThread2  implements Runnable{ // using runnable interface in this case we have to provide the object of its child class to a thread class object .
////    @Override
////    public void run() {
////        for(int i=0;i<10;i++) {
////            try {
////                wait(2000);
////            } catch (Exception e) {
////                System.out.println("I am thread created by the Runnable interface");
////            }
////
////            System.out.println("method of MyThread2 class created using runnable interface");
////        }
////}
////    }
////public class Threads {
////    public static void main(String []args){
////
////        MyThread T1= new MyThread();
////        T1.start();
////        MyThread2 T2 = new MyThread2();
////        Thread t2= new Thread(T2);
////        t2.start();
////       ;
////
////    }
////
////}
//
//
////public class Threads{
////
////    public static void main(String[] args) throws Exception {
////        Runnable thread= ()-> System.out.println(" it's anonymous class");
////        Thread t1= new Thread(thread);
////        t1.run();
////
////    }
////}
//
//public class Threads {
//    /**
//     * @param args
//     */
////    public static void main(String[] args) {
//////        String returnVal = method1();
//////        System.out.println(returnVal);
////        method1();
////    }
////  public static String method1(){
////        try {
////            int i=9/0;
////            System.out.println(i);
////            return "hello";
////        } catch (Exception e) {
////            System.out.println("exception caught");
////            return" why";
////        }
////        System.out.println("Done"); // it will generate a compile time error Unreachable code
////      return "hey";
////    }
//
//
////    public static String method1() {
////        try {
////            int i = 9;
////            System.out.println(i);
////            return "from try";
////        } catch (Exception e) {
////            System.out.println("exception caught");
////            return "from catch";
////        }
////        finally {
////            System.out.println("finally block executing");
////            return "from finally";
////        }
///* output : 9
//        finally block executing
//       from finally*/
//
////public static String method(){
////    try {
////        int i = 9/0;
////        System.out.println(i);
////    }
////    catch (Exception e) {
////        System.out.println("exception caught");
////        return "from cactch";
////    }
////    finally {
////        System.out.println("finally block executing");
////return "finally"; // if the finaly block will have a return type then the code below will not gone execute it will throw a complete time errror
////    }
////    System.out.println("end"); // this is considerd as a reachable code becuase the try block has no return type, and it is throwing a runtime exception which the compiler does not knows so it will not generate any compile time error
////
////
////    return "from end";
////}
////    public static void method1()
////    {
////        try
////        {
////            System.out.println("1");
////            int sum = 9 / 0;
////            System.out.println("2");
////        }
////        catch(ArithmeticException e)
////        {
////            System.out.println("3");
////        }
////        catch(Exception e)
////        {
////            System.out.println("4");
////        }
////        finally
////        {
////            System.out.println("5");
////        }
////    } // output 135
//
////public static void method1()
////{
////    try
////    {
////        int a[]= {1, 2, 3, 4};
////        for (int i = 1; i <= 4; i++)
////        {
////            System.out.println ("a[" + i + "]=" + a[i] + "\n");
////        }
////    }
////
////    catch (Exception e)
////    {
////        System.out.println ("error = " + e);
////    }
////    catch (ArrayIndexOutOfBoundsException e) // it will throw compile time error because the arrayIndexOutOfBound s already caught by the parentClass Exception in above catch block so it will became an unreachable code
////    {
////        System.out.println ("ArrayIndexOutOfBoundsException");
////    }
////
////}
//
//
//    }

public class Threads{
    public static void main(String[] args) throws InterruptedException{
        Runnable t1=()->{
            try{
                for (int i =0;i<10;i++){
                    System.out.println("Thread 1 is execcuting :"+ i);
                }
            }
            catch(Exception e ){
                System.out.println("exception occurred handling it ");
            }

            System.out.println("thread1 finished its execution");
        };

    Runnable t2=()->{
        try{
            for (int i =0;i<10;i++){
                System.out.println("Thread 2 is execcuting :"+ i);
            }
        }
        catch(Exception e ){
            System.out.println("exception occurred handling it ");
        }

        System.out.println("thread2 finished its execution");
    };

Runnable t3=()->{
    try{
        for (int i =0;i<10;i++){
            System.out.println("Thread 3 is execcuting :"+ i);
        }
    }
    catch(Exception e ){
        System.out.println("exception occurred handling it ");
    }

    System.out.println("thread3 finished its execution");
};

        Thread T1=new Thread(t1);
        Thread T2=new Thread(t2);
        Thread T3=new Thread(t3);

        T1.start();
//
//        T2.setDaemon(true);
        T2.start();
        T2.join();
        T3.start();
        for (int i =0;i<10;i++){
            System.out.println("hey its main method is executing"+i);
        }
}
        }
class Thread1{

}