import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      while(N>9){
          int num=N;
          int sum=0;
          while(num!=0){
              sum+=(num%10);
              num/=10;
          }
          N=sum;
      }
      System.out.println(N);
    }
}