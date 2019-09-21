
public class Feladat_4 {

	public static void main(String[] args)
	{
		if (args.length==1)
		{
			int szam=Integer.parseInt(args[0]);
			int szam2 =args[0].length();
			System.out.println("Másik megoldás: "+szam2);//Másik  megoldás
			if (szam>=1 &&szam<=1000000)
			{
				if (szam>999999)
				{
					System.out.println("A szám 7 jegyű");
				}
				else if (szam>99999)
				{
					System.out.println("A szám 6 jegyű");
				}
				else if (szam>9999)
				{
					System.out.println("A szám 5 jegyű");
				}
				else if (szam>999)
				{
					System.out.println("A szám 4 jegyű");
				}
				else if (szam>99)
				{
					System.out.println("A szám 3 jegyű");
				}
				else if (szam>9)
				{
					System.out.println("A szám 2 jegyű");
				}
				else
				{
					System.out.println("A szám 2 jegyű");
				}
			}
			else
			{
				System.out.println("A szám nem megfelelő értékű");
			}
		}
		else
		{
			System.out.println("Egy számot kell megadni");
		}
		

	}

}
