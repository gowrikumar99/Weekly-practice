class InnerForLoop
  {
    public static void main(String args[])
    {
     for(int i=1;i<=5;i++)  //outer loop
       {
         for(int j=1;j<=5;j++) //inner loop
           {
             System.out.println("i = "+i+"  j = "+j);
           }
       }
    }
  }