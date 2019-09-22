
public class Feladat_17 {

	public static void main(String[] args)
	{
		if (args.length==2)
		{
			int szam1=Integer.parseInt(args[0]);
			int szam2=Integer.parseInt(args[1]);
			for (int i = 1; i <= szam1; i++)
			{
				for (int j = 1; j <= szam2; j++)
				{
					if (i==1||j==1||i==szam1||j==szam2)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
		}
		else
		{
			for (int i = 1; i <= 5; i++)
			{
				for (int j = 1; j <=5; j++)
				{
					if (i==1|| j==1 ||j==5 || i==5)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
		}

	}

}
