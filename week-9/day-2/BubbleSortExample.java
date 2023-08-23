import java.util.Scanner;

class BubbleSortExample{


  public static void bubbleSort(int arr[]){

    int temp;
    for(int i=0;i<arr.length;i++){ // i=0;  i=1;
      for(int j=1;j<arr.length-i;j++){  // j=1 (index position is 1 ),      arr.length-0; arr-length-1;
        if(arr[j-1]>arr[j]){  // arr[j-1] means i=0,arr[j] index position 1;   
          temp=arr[j-1]; // temp=arr[j-1]  we store the value index i=0 value in temp;
          arr[j-1]=arr[j];// index i=0 value stores in index i=1;
          arr[j]=temp;// index value i=1 value stores in temp;
        }
      }
    }
  }


  
  public static void main(String args[]){
    int arr[]={34,78,23,90,71};

    
  
    System.out.println("before sorting the array : ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }


    bubbleSort(arr);
    System.out.println();
    System.out.println("after sorting the array : ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    
    
}
}