class Encapsulation{
  private String name;
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
}
class Encapsulation1{
  public static void main(String args[]){
    Encapsulation a=new Encapsulation();
    a.setName("Gowrikumar dukka");
    System.out.println(a.getName());
  }
}