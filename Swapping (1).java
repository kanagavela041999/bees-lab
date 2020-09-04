import java.util.*;
public class Swapping
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    System.out.println("Before Swapping \n x="+x+" y="+y);
	    x=x^y;
	    y=x^y;
	    x=x^y;
	    System.out.println("After Swapping \n x="+x+" y="+y);
	}
}
