//deleting element from array;
class DeleteElement{
  public static void main(String[] args){
    int a[]={10,20,30,40,50};
    int delete=40;
    int count=0;
    for(int i=0;i<a.length;i++){
      if(delete==a[i]){
        for(int j=i;j<a.length;j++){
          a[j]=a[j+1];
        }
        count=count+1;
        break;
      }
    }
    if(count==0){
      System.out.println("element not founded");
    }else{
      System.out.println("element deleted successfully");
    }
    for(int i=0;i<a.length-1;i++){
      System.out.println(a[i]+"");
    }
  }
}