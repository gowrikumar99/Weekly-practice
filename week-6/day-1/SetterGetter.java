
class Student{
  String name;
  int id;
  String addrress;
  //setters
  public void setName(String name){
    this.name=name;
  }
  public void setId(int id){
    this.id=id;
  }
  public void setAddr(String addr){
    this.addrress=addrress;
  }
  //getters
  public String getName(){
    return name;
  }
   public int getId(){
     return id;
   }
  public String getAddrress(){
    return addrress;
  }
}
public class SetterGetter{
  public static void main(String args[]){
    Student details=new Student();
    details.setName("gowri");
    details.setId(1);
    details.setAddr("vijayawada");
    System.out.println("The details are:");
    System.out.println("name:"+details.getName());
    System.out.println("id:"+details.getId());
    System.out.println("address:"+details.getAddrress());
  }
}