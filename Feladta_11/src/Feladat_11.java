
public class Feladat_11 {

	public static void main(String[] args)
	{
		if (args.length==1)
		{
			
			int db=0;
			int szam=Integer.parseInt(args[0]);
			System.out.println("A "+szam+" osztói:");
			for (int i = 1; i <= szam; i++)
			{
				if (szam%i==0)
				{
					db++;
					
					System.out.println(i);
				}
			}
			if (db<=2)
			{
				System.out.println("A megadott szám prím");
			}
		}
		else
		{
			System.err.println("Egy paramétert kell megadni!");
		}

	}

}
