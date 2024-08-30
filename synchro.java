

public class synchro {
 private static  int ctr = 0;
  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      for(int i = 0;i<500;i++){
        System.out.println(1);
        increment();
      }
    });
    Thread s = new Thread (() -> {
      for(int i = 0;i<500;i++){
        System.out.println(0);
        increment();
      }
    });
    t.start();
    s.start();
     try {
         t.join();
         s.join();
     } catch (InterruptedException ex) {
      throw new RuntimeException(ex);
     }
   System.out.println(ctr);
  }
   private synchronized static void increment(){
          ctr+=1;
   
  }


}