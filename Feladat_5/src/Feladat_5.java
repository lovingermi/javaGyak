
public class Feladat_5 {

	public static void main(String[] args)
	{
		if (args.length==2)
		{
			int szam1=Integer.parseInt(args[0]);
			int szam2=Integer.parseInt(args[1]);
			if (szam1>szam2)
			{
				System.out.println("A 1.szám a nagyobb ");
			}
			else if (szam1<szam2)
			{
				System.out.println("A 2.szám a nagyobb ");
			}
			else
			{
				System.out.println("A két szám egyforma ");
			}
		}
		else
		{
			System.err.println("Két számot kell megadni!");
		}

	}

}
