
import java.util.*;
class PerfectNo
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");	
		int no=sc.nextInt();
		int b=0;
		
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				b=b+i;		
			}
		}
		if(b==no)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");	
		}
	}
}		
		
		
	