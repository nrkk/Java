import java.util.*;
class NeonNo
{
	public static void main(String[] args)
	{
	int n1;
	int n[]=new int[100];
	int i=0;
	int sum=0;
	
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter value:");
	n1=sc.nextInt();
	int temp=n1;
	while(temp>0)
	{
	
	n[i]=temp%10;
	
	temp=temp/10;
	i++;
	}
	for(int j=0;j<=i;j++)
	{
	sum+=n[j];
	}
	System.out.println(sum);
	if((sum*sum)==n1)
	System.out.println("neon");
	else
	System.out.println("not neon");
	}
}        