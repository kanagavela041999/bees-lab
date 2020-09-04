import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of students");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
          System.out.println("Enter the student "+i+" Quarterly MArk");
          System.out.println("English:");
          int English1=sc.nextInt();
          System.out.println("Tamil:");
          int Tamil1=sc.nextInt();
          System.out.println("Math:");
          int Math1=sc.nextInt();
          System.out.println("Science:");
          int Science1=sc.nextInt();
          System.out.println("Social Science:");
          int SocialScience1=sc.nextInt();
          System.out.println("Enter the student "+i+"s HalfEarly MArk");
          System.out.println("English:");
          int English2=sc.nextInt();
          System.out.println("Tamil:");
          int Tamil2=sc.nextInt();
          System.out.println("Math:");
          int Math2=sc.nextInt();
          System.out.println("Science:");
          int Science2=sc.nextInt();
          System.out.println("Social Science:");
          int SocialScience2=sc.nextInt();
          System.out.println("Average of "+i+"student");
          System.out.println("English:"+(English2+English1)/2);
          System.out.println("Tamil:"+(Tamil1+Tamil2)/2);
          System.out.println("Math:"+(Math1+Math2)/2);
          System.out.println("Science:"+(Science1+Science2));
          System.out.println("SocialScience:"+(SocialScience1+SocialScience2)/2);
          
          
          
      }
    }
}