public class Multithread {
  public static void main(String[] args) {
     Process1 p1 = new Process1();
     Process2 p2 = new Process2();
     p1.start();
     p2.start();
  }
}

class Process1 extends Thread {
  @Override
  public void run() {
     for (int i = 0; i < 10; i++) System.out.println(i);
  }
}

class Process2 extends Thread {
  @Override
  public void run() {
     for (int i = 0; i < 10; i++) System.out.println(i);
  }
}