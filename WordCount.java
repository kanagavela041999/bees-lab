import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String Aboutbees="Intelligent Automation Platform Driven by AI";
        int count=0;
        for(int i=0;i<Aboutbees.length();i++)
        {
            if(Aboutbees.charAt(i)!=' ')
            {
                count++;
            }
        }
      System.out.println("Number of Characters:"+count);
    }
}