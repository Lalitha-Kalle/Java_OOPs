/*
attribute - 
multiple inheritance - 
multi level inheritance - 


class - two var name, top speed 
display - method 
acc 

 */

class Car {
  private int speed;
  private String name;
  // public static int acceralator() {

  // };
  

  Car(String name, int speed, int acceralator) {
    this.name = name;
    // this.acceralator = acceralator;
    this.speed = speed;
  }
  public static void display(String name, int speed) {
    System.out.printf("Name of car: %s\nSpeed of car: %dkmph",name, speed);
  }
  public static void main(String[] args) {
    Car car = new Car("Maruthi", 40, 200);
    car.display("Maruthi", 90);
  }
}

