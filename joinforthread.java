public class joinforthread {
  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(()->
    {
      for(int i = 0;i<10;i++){
        System.out.println(1);
      }
    });
    Thread t2 = new Thread(()-> 
    {
      for (int i = 0; i < 10; i++) {
        System.out.println(0);
      }
      });

System.out.println("Threading starts");
t1.start();
t2.start();
t1.join();
t2.join();
System.out.println("YEAH finished execution");
//  first print thing happens and later the thread one 

}
  }

