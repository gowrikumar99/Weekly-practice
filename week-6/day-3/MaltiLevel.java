// maltilevel inheretance
class Employee{  //super class
 float salary=30000.00f;  
}  
class Programmer extends Employee{  //sub class
 int salary1=10000;  
}
public class MaltiLevel{ // main class
 public static void main(String args[]){  
   Programmer p=new Programmer();  //object variable
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println(" Programmer salary1is:"+p.salary1);  
}  
}  