// 2).with returntype and without
class method2{
  int add(){
    int a=10;
    int b=20;
    int c=a+b;
    return c;
  }
  int sub(){
    int a=10;
    int b=20;
    int c=a-b;
    return c;
  }
  int mul(){
    int a=10;
    int b=20;
    int c=a*b;
    return c;
  }
    public static void main(String args[]){
      method2 m2=new method2();
      int result1 =m2.add();
      int result2 =m2.sub();
      int result3 =m2.mul();
      System.out.println(result1);
       System.out.println(result2);
       System.out.println(result3);
    }
  }
