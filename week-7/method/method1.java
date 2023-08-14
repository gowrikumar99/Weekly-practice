/*
1)   method :-   method is a group of statementes worked together to perform an operation  
   methods are four types those are 
   1.with returntype and with parameters
   2.with returntype and without parameters
   3.without returntype and with parameters
   4.without return type and without parameters
  */


//   1). without return type and without parameters

class method1{    // main class
  void add(){  // without return type method and without parameters
    int a=1;   //local variables
    int b=2;   //local variables
    int c=a+b;  // local variables
    System.out.println(c);
  }
  void sub(){  // without return type method and without parameters
    int a=10;  //local variables
    int b=2;  //local variables
    int c=a-b;  //local variables
    System.out.println(c);
  }
  void mul(){  // without return type method and without parameters
    int a=10;  //local variables
    int b=2;   //local variables
    int c=a*b;   //local variables
    System.out.println(c);
  }
  public static void main(String args[]){   // main method
    method1 m1=new method1();  // create object variable
    m1.add();   // object to call method
    m1.sub();   // object to call method
    m1.mul();   // object to call method
  }
}