import java.util.Scanner;
class employee{
  String name;
  int id;
  double salary;
  public void display(){
    System.out.println("name is :"+name);
     System.out.println("idis :"+id);
     System.out.println("salary is :"+salary);
  }
}
public class Employee{ 
public static void main(String args[]){
  //Scanner sc=new Scanner(System.in);
  employee e1=new employee();
  e1.name="gowri";
  e1.id=12;
  e1.salary=1234.34;
  e1.display();
   employee e2=new employee();
  e2.name="pavan";
  e2.id=11;
  e2.salary=1233.34;
  e2.display();
   employee e3=new employee();
  e3.name="kumar";
  e3.id=13;
  e3.salary=1235.34;
  e3.display();
}
}
