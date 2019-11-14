import java.util.*;
public class Question3
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
	
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter k value");
		int k=s.nextInt();
		int t;
		int r=n*(n+1);
		if(k==1)
		{
			System.out.println(r/2);
		}
		else if(k>1)
		{
			t=((n-k+1)*(n-k+2))/2;
			System.out.println(t);
		}
	}
	
}