public class learnAbstract {
public static void main(String[] args) {
  // vehicle v1 = new vehicle();
  Car c1 = new Car();
  c1.accelerate();
  c1.breaks(4);
}
}
abstract class vehicle{

    abstract void accelerate();
    abstract int breaks(int wheels);
}
class Car extends vehicle{
void accelerate(){
System.out.println("car is accelerating");
}
int breaks(int wheels){
System.out.println("car is running");
return wheels;
}

}