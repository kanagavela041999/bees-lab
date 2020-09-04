import java.util.*;
public class MissingNumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=0;
	    int arr[]=new int[n+1];
	    for(int  i=0;i<n-1;i++)
	    {
	        arr[i]=sc.nextInt();
	        sum+=arr[i];
	    }
	    int overallsum=(n*(n+1))/2;
	    System.out.println("The missing number is "+(overallsum-sum));
	   
	}
}