import java.util.*;
class SwapTwoNos
{
	public static void main(String[] args)
	{
	int n1,n2;
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter value1:");
	n1=sc.nextInt();

	System.out.println("Enter value2:");
	n2=sc.nextInt();
	System.out.println("n1="+n1+" n2="+n2);
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	System.out.println("n1="+n1+" n2="+n2);
	}
}        