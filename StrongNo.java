import java.util.*;
class StrongNo
{
	public static void main(String[] args)
	{
	int n1;
	int n[]=new int[100];
	int temp1[]=new int[100];
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
	temp1[j]=n[j];
	
	while(n[j]>1)
	{
	temp1[j]=temp1[j]*(n[j]-1);
	n[j]-=1;
	}
	}

	
	for(int k=0;k<=i;k++)
	{
	sum+=temp1[k];
	}
	
	System.out.println(sum);
	if(sum==n1)
	System.out.println("strong");
	else
	System.out.println("not strong");
	}
}        