import java.util.Scanner;
public class Main {
  public static void rezef(int [] arr){
    int temp;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++)
        if(arr[i]==arr[j]){
          temp = arr[i+1];
          arr[i+1] = arr[j];
          arr[j] = temp;
        }
         
    }
  }
  public static int mergeVals(int [] arr1,int start){
    for(int i=start;i<arr1.length;i++){
      for(int j=i+1;j<arr1.length;j++){
        if(arr1[i]==arr1[j]){
          int num = arr1[j];
          for(int x=j;x>=i+1;x--){
            int a = arr1[x];
            int b = arr1[x-1];
            arr1[x]=b;
          }
          arr1[i+1] = num;
          return i+1;
        }
      }
    }
    return arr1.length;
  }
  public static void combine(int [] arr1){
    int result =0 ;
    while (result<arr1.length){
      result = mergeVals(arr1, result);
    }
  }
  public static void print(int [] ar){
    for(int i=0;i<ar.length;i++){
      System.out.println(ar[i]);
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] arr = {7,12,45,6,7,45,45,8,6};
    // int [] arr = {2,5,1,5,2};
    // System.out.println("Hello world!");
    combine(arr);
    print(arr);
  }
}