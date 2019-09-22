
public class Feladat_10 {

	public static void main(String[] args)
	{
		if (args.length==2)
		{
			int szam1=Integer.parseInt(args[0]);
			int szam2=Integer.parseInt(args[1]);
			System.out.println("3-mal osztahtó számok " + szam1 + " és " + szam2 + " között");
			for (int i = szam1; i <= szam2; i++)
			{
				if (i%3==0)
				{
					System.out.print(i+" ");
				}
			}
		}
		else
		{
			System.err.println("Két számot kell megani!");
		}

	}

}
