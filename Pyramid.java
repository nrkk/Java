import java.util.*;
class Pyramid
{
	public static void main(String[] args)
	{
	int n;
	
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter value:");
	n=sc.nextInt();
	for(int j=1;j<=n;j++)
	{
	for(int i=n;i>j;i--)
	{
	System.out.print(" ");
	}
	
	for(int k=1;k<=j;k++)
	{
	
	
	System.out.print(k+" ");
	}
	
	System.out.println("");
	}
	}
}
	