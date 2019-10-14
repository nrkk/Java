import java.util.*;
import java.text.*;
class Salary
{
	public static void main(String[] args)
	{
	int year;
	float sal;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter salary:");
	sal=sc.nextFloat();
	System.out.println("Enter year:");
	year=sc.nextInt();
	if(year>5)
	{
	sal=sal*1.05f;
	}
	System.out.println(sal);
	}
}
	
