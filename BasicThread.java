public class BasicThread{
  public static void main(String[] args) {
  demo1 d = new demo1();
  demo2 d2 = new demo2();
  d.start();
  d2.start();

  }
}
class demo1 extends Thread{
  @Override
  public void run(){
    for(int i = 0;i<100000;i++){
      System.out.println(1);
    }
  }
}
class demo2 extends Thread{
  @Override
  public void run(){
    for(int i = 0;i<100000;i++){
      System.out.println(2);
    }
  }
}