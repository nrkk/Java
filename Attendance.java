import java.util.*;
import java.text.*;
class Attendance
{
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	 float classes;
	 float attended;
	float percent;
	char medical;
	System.out.println("enter classes");
	classes=sc.nextInt();
	System.out.println("enter attended");
	attended=sc.nextInt();
	System.out.println("medical cause y or n");
	medical=sc.next().charAt(0);
	percent=(attended/classes)*100;
	System.out.println("percent:"+(int)percent);
	if(percent>75 && medical =='y')
	System.out.println("allowed");
	else
	System.out.println("not allowed");
	}
}