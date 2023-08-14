
//super keyword() 
 
class Persion   //class
{
   String Pid; //instance variables
   String Pname;//instance variable
   String Pgender;
  Persion(String Pid1, String Pname1, String Pgender1) //constracter
   {
       Pid = Pid1;
       Pname = Pname1;
       Pgender = Pgender1;
   }
   public void getPersionDetails() //non static method
   {
       System.out.println("Persion Id :"+Pid);
       System.out.println("Persion name :"+Pname);
       System.out.println("Persion gender :"+Pgender);
   }
}
 
class Worker extends Persion  //we can take another class
{
  int Workerid; // instance variable
  Worker(String Pid1, String Pname1, String Pgender1,int id)
   {
     super(Pid1,Pname1,Pgender1); 
     //calling the super class constructor
       Workerid=id;  
       
   }
   public void getWorkerDetails()
    {
        System.out.println("WorkerDetails");
        System.out.println("-----------------");
        getPersionDetails();
         System.out.println("Workerid:"+ Workerid);
    }
}
 
class Accountant extends Persion  // another class
{
   Accountant(String Pid1, String Pname1, String Pgender1)
   {
       super(Pid1,Pname1,Pgender1);
     //super();
   }
   public void getAccountantDetails() //non-static method
   {
        System.out.println("Accountant Details");
        System.out.println("--------------------");
        getPersionDetails();
   }
}
 
public class SuperKeyWord    //super class
{
      public static void main(String[] args)
      {
          Worker W = new Worker("persion-1","gowri","male",9);
          W.getWorkerDetails();
          System.out.println();
          Accountant acc = new Accountant ("Persion-2","kumar","male");
          acc.getAccountantDetails();
}
}