public class Bicycle{
  int speed = 0;
  int cadence = 0;
  int gear = 0;

  void changeGear(int newValue){
    gear = newValue;
  }

  void increaseSpeed(int increment){
    speed += increment;
  }

  void decreaseSpeed(int decrement){
    speed -= decrement;
  }

  void changeCadence(int newValue){
    cadence = newValue;
  }

  void printStates(){
    System.out.println("Speed : " + speed + " Cadence : " + cadence + " Gear : " + gear);
  }
}
