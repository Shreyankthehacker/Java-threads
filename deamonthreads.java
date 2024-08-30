public class deamonthreads {
  public static void main(String[] args) {
    deamon1 d = new deamon1();
    deamon2 r = new deamon2();
    d.setDaemon(true);
    d.start();
    r.start();
  }
}

class deamon1 extends Thread{
  @Override
  public void run(){
    int count = 0;
    while(count<20){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        count++;
        System.out.println("Deamon helper running");
    }
  }
}

class deamon2 extends Thread{
  @Override
  public void run(){
    int count = 0;
    while(count<2){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }
        count++;
        System.out.println("Deamon helper aint running");
    }
  }
}/* First goes towards the user thread there it finds sleep for 5 second so why waste time till then
so it executes the deamon for next 4 seconds and then comes back to user and once the user thread is done
it will terminate the deamon thread */