// very Light weighted process or we can say the smallest subpart of a process is thread allows the program to execute properly and perform multiple task simultaneously.

// java has  in-built thread such as main thread which executes the program main method and a garbage collectior thread which perform task related garbage cleaning .

// we can create thread by using thread class or by implementing runnable interfacegit

class MyThread extends Thread{ // 1. using thread class

    public void run(){
//        for(int i=0;i<10;i++){
//            try{
//
//                wait(1000);
//            }
//            catch( Exception e){
//                System.out.println("I am a thread created by thread class ");
//            }
        }
    }


class MyThread2  implements Runnable{ // using runnable interface in this case we have to provide the object of its child class to a thread class object .
    @Override
   synchronized public void run() {
//        for(int i=0;i<10;i++) {
//            try {
//                wait(2000);
//            } catch (Exception e) {
//                System.out.println("I am thread created by the Runnable interface");
//            }
//        }
}}
public class Threads {
    public static void main(String []args){

        MyThread T1= new MyThread();
        T1.start();
        MyThread2 T2 = new MyThread2();
        Thread t2= new Thread(T2);
        t2.start();
       ;

    }

}
