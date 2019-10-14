import java.util.*;
class AddTwoNos
{
	public static void main(String[] args)
	{
	float noOne=Float.parseFloat(args[0]);
	float noTwo=Float.parseFloat(args[1]);
	double value=345.67;
	short s=234;
	byte b=122;
	int a=s+b;
	System.out.println("addition of 2 no's is:" +(noOne+noTwo)+ " "+value);
	System.out.println(s+" "+b+" "+a);


	int n1;
	float n2;
	char ch;
	String name;
	String location;
	boolean bl;

	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter int value:");
	n1=sc.nextInt();

	System.out.println("Enter float value:");
	n2=sc.nextFloat();

	System.out.println("sum is: "+(n1+n2));

	System.out.println("enter a char:");
	ch=sc.next().charAt(0);

	System.out.println("enter a name:");
	name=sc.next();

	System.out.println("enter a location:");
	location=sc.next();

	System.out.println("enter a bool value:");
	bl=sc.nextBoolean();

	System.out.println(n1+" "+n2+" "+ch+" "+name+" "+location+" "+bl);
	}
}                                                                                                                 