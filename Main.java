public class Main {
  
  public static void main(String[] args) {
  Normal obj1 = new Normal();
  Normal obj2 = new Normal();
  obj1.f1();
  obj1.f3();
  obj2.f2();
  System.out.println("See the difference bw all these ");
  System.out.println(Normal.x);
  obj1.f3();
  obj2.f3();

  
 
   
  }
}
class Normal{
  static  int x;
 void f1() {
  x = 10;
 }
 void f2(){
  x = 20;
 }
 void f3(){
  System.out.println(x);
 }
}
