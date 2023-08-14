// maltilevel inheretance
class add{
  int a=15,b=10;   // instance variables
  void add(){      //super method
    System.out.println(a+b);
  }
}
class sub extends add{
  void sub(){      // sub method
    System.out.println(a-b);
  }
}
class mal extends sub{
  void mal(){
    System.out.println(a*b);
  }
}
class div extends mal{
  void div(){
    System.out.println(a/b);
  }
}
class MaltilevelInheretence{   // main class
  public static void main(String args[]){   // main method
    div m1=new div();     // object creation
    m1.add();     // calling object to method
    m1.sub();     // calling object to method
    m1.mal();     // calling object to method
    m1.div();     // calling object to method
  }
}
