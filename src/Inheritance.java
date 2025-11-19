interface A{
 int add(int x, int y,int z);
 default void sayHello(){
   System.out.println("interface method");
  }
   static void greet() {
    System.out.println("Hello from interface static method");
  }
}
class B implements A{

   public int add(int x, int y,int z) {
    return x+y+z;
  }
  public void sayHello(){
    System.out.println("child method");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    A obj=new B();
    obj.sayHello();
    System.out.println(obj.add(2,3,4));
    A.greet();
  }
}
