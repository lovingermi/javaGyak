
public class Feladat_6 
{
	public static void main(String[] args) 
	{
		if (args.length==1)
		{
			int szam=Integer.parseInt(args[0]);
			switch (szam)
			{
				case 10: 
					System.out.println("Tíz");
				case 9:
					System.out.println("Kilenc");
				case 8:
					System.out.println("Nyolc");
				case 7:
					System.out.println("Hét");
				case 6:
					System.out.println("Hat");
				case 5:
					System.out.println("Öt");
				case 4:
					System.out.println("Négy");
				case 3:
					System.out.println("Három");
				case 2:
					System.out.println("Kettő");
				case 1:
					System.out.println("Egy");
				case 0:
					System.out.println("Nulla");
					break;

			default:System.out.println("A szám értéke nem megfelelő");
				break;
			}
		}
		else
		{
			System.err.println("Egy számot kell megadni");
		}
	}
}
