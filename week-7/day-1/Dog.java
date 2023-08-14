abstract class Animal{
  abstract void sound();
  void display(){
    System.out.println("i am from animal class");
  }
  Animal(){
    System.out.println("this is constractor");
  }
  static void m1(){
    System.out.println("this is static method");
  }
}
class Dog extends Animal{
  void sound(){
    System.out.println("barking");
  }
  public static void main(String args[]){
    Dog d=new Dog();
    d.sound();
  }
}