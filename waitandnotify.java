public class waitandnotify {
  private static final Object lock = new Object(); 
  public static void main(String[] args) {
    Thread t = new Thread(() -> {
        try {
            t();
        } catch (InterruptedException ex) {
        }
    });
    Thread s = new Thread(() -> {
        try {
            s();
        } catch (InterruptedException ex) {
        }
    });
    
    t.start();
    s.start();

  }
  private static void t() throws InterruptedException{
    synchronized (lock) {
      System.out.println(" HEllo from the `1st ");
      lock.wait();
      System.out.println("Back again in 1st method");
    }
  }
  private static void s() throws InterruptedException{
    synchronized (lock) {
        
    
  System.out.println("Hello from method 2");
  lock.notify();
  System.out.println("Back again to 2nd after notifying");
  }}

}

/* First control goes to t then it asks t to wait and then control goes to s there lock notifies tht it is ready
 * to pass control to the next but before that it still executes the remaining part of the block and then gives control to where it was waiting
 * and then it goes on
 * 
 */
