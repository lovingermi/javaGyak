
public class Feladat_3 {

	public static void main(String[] args)
	{
		// A háromszög szerkeszthető-e: két oldal hosszának az összege nagyobb legyen a harmadik oldalnál.
		if (args.length==3)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			if (a+b>c&&a+c>b&&b+c>a)
			{
				System.out.println("A háromszög megszerkeszthető");
			}
			else
			{
				System.out.println("A háromszög nem szerkeszthető meg");
			}
		}
		else
		{
			System.out.println("Három számot kell megadni");
		}

	}

}
