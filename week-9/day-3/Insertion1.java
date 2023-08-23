class Insertion1{

  public static void sort(int arr[]){
    for(int j=1;j<arr.length;j++){// j=1 (index 1)but value 55;j=2(index is 3)but value 90;
      int key=arr[j]; // key=55; key=90;key=43;
      int i=j-1;  // i=1-1=0;i=2-1=1 ; i=3-1=2;

      while(arr[i]>key && i>-1){ // here arr[i]=14, and key=55 so 14>55 conition is not satisfied after this loop is not existing.arr[1]>key 55>90 condition is not satisfied,loop is not existing.arr[90]>43 condition is satisfied.
        arr[i+1]=arr[i];
        i--;
      }

      arr[i+1]=key;// arr[0+1]=arr[1]=55 stores.
      
    }
  }


  
  public static void main(String args[]){
    int[] arr={14,55,90,43,58};

    System.out.println("Before Insertion Sort : ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

    sort(arr);

    System.out.println();
    System.out.println("After Insertion sort : ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    
  }
}