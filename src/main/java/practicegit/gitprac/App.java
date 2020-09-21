package practicegit.gitprac;

import org.apache.logging.log4j.*;
import java.util.Scanner;
public class App 
{
    private static final Logger LOG=LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        add(a,b);
    }
	private static void add(int a,int b) {
		long sum=a+b;
		LOG.info("Sum of the 2 numbers is :"+sum);
	}
}
