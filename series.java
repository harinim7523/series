package day33;
import java.util.*;
public class series {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n");
	int n=sc.nextInt();
	int m=20;
	int i;
	for(i=0;i<n;i++)
	{
		System.out.println(m);
		m=m+40+(i*4);
		
	}
}
}
