import java.util.*;
public class gcd{
	public static void main(String args[]){
		int x,y,i;
		int gcd=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers : ");
		x=sc.nextInt();
		y=sc.nextInt();
		for(i=1;i<=x && i<=y;i++)
		{
			if(x%i == 0 && y%i == 0)
			{
				gcd=i;
			}
		}
		System.out.printf("gcd = %d ",gcd);
	}

}