interface Fare{
  int totalFare(int km);
}
class Vehicle{
  void run(){
    System.out.println("vehicles runs ");
  }
}
class Bus extends Vehicle implements Fare{
  @Override
  void run(){
    System.out.println("bus runs fast");
  }
  @Override
  public int totalFare(int km) {
    return km*10;
  }
}
public class MethodHiding {
  public static void main(String[] args) {
    Bus bus=new Bus();
    bus.run();
    System.out.println("total fare to pay "+bus.totalFare(5));
  }
}
