public class Bicycle{
  int speed = 0;
  int cadance = 0;
  int gear = 0;

  void changeGear(int newValue){
    gear = newValue;
  }

  void increaseSpeed(int increment){
    speed += increment;
  }

  void decreaseSpedd(int decrement){
    speed -= decrement;
  }

  void changeCadence(int newValue){
    cadence = newValue;
  }
}
