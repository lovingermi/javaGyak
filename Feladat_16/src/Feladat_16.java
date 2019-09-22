
public class Feladat_16 {

	public static void main(String[] args)
	{
		for (int i = 1; i <=10 ; i++)
		{
			for (int j = 1; j <= 40; j++)
			{
				if (j<=15 && i<=5)
				{
					System.out.print("*");
				}
				else
				if(j<40)
				{
					System.out.print("-");
				}
				else
				{
					System.out.println("-");
				}
			}
		}

	}

}
