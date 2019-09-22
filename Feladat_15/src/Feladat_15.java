
public class Feladat_15 {

	public static void main(String[] args)
	{
		//Legyen a paraméter egy 100 és 9999 közé eső szám! Írasd ki a képernyőre a számjegyek összegét! A megoldáshoz használj ciklust!
		if (args.length==1)
		{
			String str=args[0];
			int osszeg=0;
			for (int i = 0; i < str.length(); i++)
			{
				char chr=str.charAt(i);
				osszeg+=Character.getNumericValue(chr);
				//osszeg+=Integer.parseInt(String.valueOf(str.charAt(i)));// ez is ok
				
			}
			System.out.println("A számjegyek összege:");
			System.out.println(osszeg);
			
		}
		else
		{
			System.err.println("Egy paramétert kell megadni!");
		}

	}

}
