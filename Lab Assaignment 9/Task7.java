public class Task7{
  public static void main(String args[]){
    java.util.Scanner abesh=new java.util.Scanner(System.in);
    int [] array= new int [10];
    for(int i=0;i<array.length;i++){
      array[i]=abesh.nextInt();
    }
    for(int j=9;j>=0;j--){
      if(array[j]%2==0){
      System.out.println("last even number is " +array[j]);
      break;}
    }}}