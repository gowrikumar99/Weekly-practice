// single hineretance

class SingleLevel{
  float salary=40000;     //instance variable
}
class SingleInheretance extends SingleLevel{  //main class
  int bonus=10000;
  public static void main(String args[]){    // main method
    SingleInheretance p=new SingleInheretance();           // object creation
    System.out.println("Total salary :"+(p.salary+p.bonus));
  }
}
// opt is 50000