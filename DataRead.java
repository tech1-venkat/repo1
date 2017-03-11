import java.util.Scanner;
public class DataRead 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter 1st num");
	int x=s.nextInt();
	System.out.println("enter 2nd num");
int y=s.nextInt();
int z=x*y;
System.out.println("mul("+x+"*"+y+")="+z);
System.out.println("first change");
System.out.println("2nd change");
System.out.println("3rd change");
}
}
