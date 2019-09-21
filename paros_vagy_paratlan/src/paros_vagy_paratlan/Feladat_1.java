package paros_vagy_paratlan;

public class Feladat_1 {

	public static void main(String[] args) 
	{
		if (args.length==1)
		{
			int szam=Integer.parseInt(args[0]);
			if (szam%2==0)
			{
				System.out.println(szam+" páros");
			}
			else
			{
				System.out.println(szam+" páratlan");
			}
		}
		else
		{
			System.out.println("Egy paramétert kell megadni.");
		}
		

	}

}
