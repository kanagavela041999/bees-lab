import java.util.*;
class Main
{
    public static boolean oneisThere(int n)
    {
        while(n>=10)
        {
            n=n/10;
        }
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void  main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting Range");
        int start=sc.nextInt();
         System.out.println("Enter the starting Range");
         int end=sc.nextInt();
         int onecount=0;
         for(int i=start;i<=end;i++)
         {
             if(oneisThere(i))
             {
                 onecount++;
             }
         }
         System.out.println(onecount);
    }
}