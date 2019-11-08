import java.util.*;
import java.lang.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		double e=2.71828;
		String[][] a=
		{
			{"1.Trig","  2.Inverse"," 3.x!"},
			{"4.x^2 ","  5.x^3    "," 6.x^y"},
			{"7.sqrt","  8.cbrt   "," 9.xroot"},
			{"10.e   "," 11.log    ","12.Rnd"}
		};
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.format(a[i][j]+"       ");
			}System.out.println();
		}System.out.println("Choose an option: ");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			String[] b={"1.sin  ","2.cos  ","3.tan  "};
			for(int i=0;i<3;i++)
				{
					System.out.print(b[i]);
				}System.out.println("\nChoose an option: ");
			int num1=sc.nextInt();
				switch(num1)
				{
					case 1:
					System.out.println("Enter the value: ");
					double sin=sc.nextDouble();
					System.out.println("Ans: "+Math.sin(sin));
					break;
					case 2:
					System.out.println("Enter the value: ");
					double cos=sc.nextDouble();
					System.out.println("Ans: "+Math.cos(cos));
					break;
					case 3:
					System.out.println("Enter the value: ");
					double tan=sc.nextDouble();
					System.out.println("Ans: "+Math.tan(tan));
					break;
				}
			break;

			case 2:
			String[] c={"1.asin  ","2.acos  ","3.atan"};
			for(int i=0;i<3;i++)
			{
				System.out.print(c[i]);
			}System.out.println("\nChoose an option: ");
			int num2=sc.nextInt();
				switch(num2)
				{
					case 1:
					System.out.println("Enter the value: ");
					double asin=sc.nextDouble();
					System.out.println("Ans: "+Math.asin(asin));
					break;
					case 2:
					System.out.println("Enter the value: ");
					double acos=sc.nextDouble();
					System.out.println("Ans: "+Math.acos(acos));
					break;
					case 3:
					System.out.println("Enter the value: ");
					double atan=sc.nextDouble();
					System.out.println("Ans: "+Math.atan(atan));
					break;
				}
			break;

			case 3:
			System.out.println("Enter the value: ");
			int z=sc.nextInt();
			int i=1,fact=1;
			while(i<=z)
			{
				fact*=i;
				i++;
			}System.out.println("Ans: "+fact);
			break;

			case 4:
			System.out.println("Enter the value: ");
			double y=sc.nextDouble();
			System.out.println("Ans: "+y*y);
			break;

			case 5:
			System.out.println("Enter the value: ");
			double x=sc.nextDouble();
			System.out.println("Ans: "+x*x*x);
			break;

			case 6:
			System.out.println("Enter base value: ");
			double w=sc.nextDouble();
			System.out.println("Enter exp value: ");
			double v=sc.nextDouble();
			System.out.println("Ans: "+Math.pow(w,v));
			break;

			case 7:
			System.out.println("Enter the value: ");
			double u=sc.nextDouble();
			System.out.println("Ans: "+Math.pow(u,0.5));
			break;

			case 8:
			System.out.println("Enter the value: ");
			double t=sc.nextDouble();
			System.out.println("Ans: "+Math.pow(t,(double)1/3));
			break;

			case 9:
			System.out.println("Enter base value: ");
			double s=sc.nextDouble();
			System.out.println("Enter root value: ");
			double r=sc.nextDouble();
			System.out.println("Ans: "+Math.pow(s,(double)1/r));
			break;

			case 10:
			System.out.println("Value of e is: 2.71828");
			break;

			case 11:
			System.out.println("1.Natural  2.Common");
			System.out.println("Choose an option: ");
			int log=sc.nextInt();
				switch(log)
				{
					case 1:
					System.out.println("Enter the value: ");
					double q=sc.nextDouble();
					System.out.println("Ans: "+Math.log(q));
					break;
					case 2:
					System.out.println("Enter the value: ");
					double p=sc.nextDouble();
					System.out.println("Ans: "+Math.log10(p));
					break;
				}
			break;

			case 12:
			System.out.println("1.Integer  2.Decimal");
			System.out.println("Choose an option: ");
			int ran=sc.nextInt();
			Random rand=new Random();
				switch(ran)
				{
					case 1:
					System.out.println(rand.nextInt());
					break;
					case 2:
					System.out.println(rand.nextDouble());
					break;
				}
			break;
		}
	}
}