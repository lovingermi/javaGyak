
public class Feladat_8 {

	public static void main(String[] args) 
	{
		if (args.length>0)
		{
			System.out.println("A paraméterek:");
			for (int i = 0; i < args.length; i++)
			{
				System.out.print(args[i]+" ");
			}
		}
		else
		{
			System.err.println("Nem adtál meg paramétert!");
		}
		

	}

}
