import java.util.*;
import java.text.*;
class Series
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n;
	float sum=0;
	n=sc.nextInt();
	for(float i=1;i<=n;i++)
	{
	sum+=1/i;
	}
	System.out.println(sum);
	}
}