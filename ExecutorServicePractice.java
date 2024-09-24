import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.*;

public class ExecutorServicePractice {
    public static void main(String[] args) {

//        Single thread Exectuor Service method of Executor service
//        try(ExecutorService service =  Executors.newSingleThreadExecutor()){
//            for(int i =0;i<5;i++) {
//                service.execute(new Task(i));
//            }
//        }
//        catch(Exception e){
//            System.out.println("exception is catched or handled "+e);
//        }


//         Fixed threadPool service of the Executor Service
//        ExecutorService service=Executors.newFixedThreadPool(2);
//        try {
//            for (int i = 0; i < 9; i++) {
//                service.execute(new Task(i));
//            }
//        }
//        catch(Exception w){
//            System.out.println("exceotion handeld no problem now :");
//        }
//
//    }



        // CachedThreadPool Executor
//        ExecutorService service=Executors.newCachedThreadPool();
//        try {
//            for (int i = 0; i < 9; i++) {
//                service.execute(new Task(i));
//            }
//        }
//        catch(Exception w){
//            System.out.println("exceotion handeld no problem now :");
//        }


        // ScheduledThread Pool Executor
        ScheduledExecutorService service=Executors.newScheduledThreadPool(1);
        try {
            for (int i = 0; i < 9; i++) {

                service.scheduleAtFixedRate(new Task(i),1000,2000, TimeUnit.MILLISECONDS);
            }
        }
        catch(Exception w){
            System.out.println("exceotion handeld no problem now :");
        }
        service.schedule(()->{
            System.out.println("i am going to stop the function ");
            service.shutdown();

        },3,TimeUnit.SECONDS);

    }


}
class Task implements Runnable{
    private int id;
    Task(int i ){
        this.id=i;
    }
    @Override
    public void run() {
        System.out.println("hey we are actually running a task using ID :"+this.id+ "thread name: "+Thread.currentThread().getName() );
    }
}