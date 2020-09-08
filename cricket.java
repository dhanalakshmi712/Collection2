import java.util.*;
public class Cricket {
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
			
	
		for(int j=0;j<num;j++)
		{
		if((j+1)%2!=0&&(score%2==0)){
			
			sum=sum+al.get(i);
			
		}
    	}
		
		}
		System.out.println(sum);
}
}