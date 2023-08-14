class Thiskeyword{
  int x=10;    //instance variable
  void display(){
    int x=20;//local variable
    System.out.println(this.x);   // print thiskeyword
  }
  void call(){
    int y=30;   //another local variable
    System.out.println(y);
  }
  public static void main(String args[]){
    Thiskeyword stu=new Thiskeyword();   //object 1
    Thiskeyword stu1=new Thiskeyword();  //object 2
    stu.display();  //call display method
    stu1.call();  //call call method
  }
}