import java.util.*;
 

/**
 * Write a description of class LombaHitung here.
 * 
 * @author Dheavira Hadina Putri - 1606831773 
 */
public class RunForYourLife implements Runnable {
   private Thread t;
   private String threadName;
   private int delay;
   
   
   RunForYourLife(String name, int delay) {
      threadName = name;
      this.delay = delay;
      System.out.println(threadName + ", Ready.");
   }
   
   public void run() {
      System.out.println(threadName + ", Go!");
      try {
         for(int i = 1; i <= 20; i++) {
            System.out.println(threadName + " has passed checkpoint (" + i +")");
            // Let the thread sleep for a while.
            Thread.sleep(delay);
         }
      }catch (InterruptedException e) {
         System.out.println(threadName + " was interrupted.");
      }
      System.out.println(threadName + " has finished!");
   }
   
   public void start () {
      System.out.println(threadName + ", Set...");
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}


