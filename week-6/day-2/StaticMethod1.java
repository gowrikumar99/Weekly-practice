
class Employee{
  String name;
  int id;
  String department;
  static String officeName="XYZ";
  Employee(String name,int id,String department){
    this.name = name;
    this.id = id;
    this.department=department;
  }
  void displayDetails(){
    System.out.println("name : "+name+" id : "+id+" department : "+department+" officename : "+officeName);
  }
  static void changeOfficeName(){
    officeName ="TCS";
  }

}
public class StaticMethod1{
  public static void main(String[] args){
    Employee e1 = new Employee("swathi",11,"abc");
    Employee e2 = new Employee("swetha",12,"abc");
    e1.displayDetails();
    e2.displayDetails();
    Employee.changeOfficeName();
    e1.displayDetails();
    e2.displayDetails();
  }
}