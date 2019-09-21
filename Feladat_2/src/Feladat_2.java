
public class Feladat_2 {

	public static void main(String[] args) 
	{
		if (args.length==1)
		{
			int szam=Integer.parseInt(args[0]);
			if (szam%2==0)
			{
				System.out.println(szam+" osztható kettővel");
			}
			else
			{
				System.out.println(szam+" nem osztható kettővel");
			}
			if (szam%3==0)
			{
				System.out.println(szam+"osztható hárommal");
			}
			else
			{
				System.out.println(szam+"  nem osztható hárommal");
			}
			if (szam%5==0)
			{
				System.out.println(szam+" osztható öttel");
			}
			else
			{
				System.out.println(szam+"  nem osztható öttel");
			}
		}
		else
		{
			System.out.println("E számot kell megadni!");
		}
		

	}

}
