import java.util.*;
import java.text.*;
class QNo
{
	public static void main(String[] args)
	{
	int n1;
	int a;
	int n[]=new int[100];
	int i=0;
	int avg,prod=1,sum=0;
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.println("Enter value:");
	n1=sc.next().charAt(0);
	a=Character.getNumericValue(n1);
	
	if(n1=='q')
	break;
	
	n[i]=a;
	i++;
	}
	for(int k=0;k<i;k++)
	{
	sum+=n[k];
	prod*=n[k];
	}
	avg=sum/i;
	System.out.println("Avg:"+avg+" prod:"+prod);
	}
}