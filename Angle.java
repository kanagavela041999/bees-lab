import java.util.*;
class Main
{
	public static int findtheangle(int hour, int min)
	{
	    	int minVal=(min*360)/(60);
	    	int hourvalue=(hour*360)/12+(min*360)/(12*60);
	    	int angle = Math.abs(hourvalue - minVal);
	    	if (angle > 180) {
			angle = 360 - angle;
		}

		return angle;
	}

	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	     int hourhand=sc.nextInt();
	    System.out.println(":");
	    int minhand=sc.nextInt();
		System.out.print(findtheangle(hourhand, minhand));
	}
}