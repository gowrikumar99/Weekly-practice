class Inheretance1{
  String name="pavan";
  void does(){
    System.out.println("Inheretance");
  }
}
class simple extends Inheretance1{
  String name="bitlabs";
}
class maltilevel extends Inheretance1{
  int id=111;
}
class irherical extends Inheretance1{
  float salary=20000.00f;

}
  public class  Inheretance{ 
  public static void main (String args[]){
    Inheretance1 sc=new Inheretance1();
    System.out.println(sc.name);
    System.out.println(sc.id);
    System.out.println(sc.salary);
    System.out.println(sc.name);
  }
}