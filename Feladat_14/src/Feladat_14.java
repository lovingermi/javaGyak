
public class Feladat_14 {

	public static void main(String[] args)
	{
		//A számtani közép program:
		if (args.length!=0)
		{
			int osszeg=0;
			double szKozep;
			for (int i = 0; i < args.length; i++)
			{
				osszeg+=Integer.parseInt(args[i]);
			}
			szKozep=(double)osszeg/args.length;
			System.out.println("A számtani közép:");
			System.out.println(szKozep);
		}
		else
		{
			System.err.println("Egy paramétert meg kell adni!");
		}

	}

}
