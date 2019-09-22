
public class Feladat_13 {

	public static void main(String[] args)
	{
		if (args.length==1)
		{
			int szamol=0;
			int szam=Integer.parseInt(args[0]);
			System.out.println("A szám:" +szam);
			System.out.println("Az osztók:");
			for (int i = 1; i < szam; i++)
			{
				if (szam%i==0)
				{
					szamol+=i;
					
					System.out.println(i);
				}
			}
			if (szamol==szam)
			{
				System.out.println("A szám tökéletes az összeg:"+szamol);
			}
			else
			{
				System.out.println("A szám nem tökéletes az összeg:"+szamol);
			}
		}
		else
		{
			System.out.println("Egy paraméter várok!");
		}

	}

}
