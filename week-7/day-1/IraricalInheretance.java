// Hirarecal inheretance
class animal{
  void eat(){
    System.out.println("eating");
  }
}
class dog extends animal{
  void bark(){
    System.out.println("barking");
  }
}
class cat extends animal{
  void meow(){
    System.out.println("meowing");
  }
}
class IraricleInheretance{    // main class
  public static void main(String args[]){  // main method
    cat c=new cat();
      c.meow();
      c.eat();
    dog d=new dog();
      d.bark();
      d.eat();
  }
}