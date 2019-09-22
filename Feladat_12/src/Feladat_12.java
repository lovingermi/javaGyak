
public class Feladat_12 {

	public static void main(String[] args)
	{

		if (args.length==2)
		{
			String szoveg=args[0];
			int szam=Integer.parseInt(args[1]);
			for (int i = 0; i < szam; i++)
			{
				for (int j = 0; j < i; j++)
				{
					System.out.print("  ");
				}
				System.out.println(szoveg);
			}
		}
		else
		{
			System.err.println("Két paraméter kell!");
		}

	}

}
