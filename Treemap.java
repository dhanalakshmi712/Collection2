import java.util.*;
public class Treemap {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of players");
	int num=sc.nextInt();
	TreeSet<Integer> ts=new TreeSet<>();
	for(int i=1;i<=num;i++)
	{
		System.out.printf("enter the details of player:",i);
		sc.nextInt();
		sc.next();
		sc.next();
		sc.next();
		ts.add(i);
	}
	System.out.println(ts);
	
	
}
}
