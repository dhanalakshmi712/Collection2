import java.util.*;
public class Batsman {

	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<num;i++)
		{
			int score=sc.nextInt();
			al.add(score);
			
		}
		for(int j=0;j<num;j++)
		{
		if((j+1)%2==0){
			
			sum=sum+al.get(j);
			
			
		}
    	}
		System.out.println(sum);
		}
		
}

