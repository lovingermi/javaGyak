
public class Feladat_7 {

	public static void main(String[] args)
	{
		/*1.      Ha a D=b2-4ac>0, akkor a másodfokú egyenletnek két különböző valós gyöke van, és ezeket a  fenti megoldóképlet segítségével határozhatjuk meg.

		2. Ha D=b2-4ac=0, ekkor a másodfokú egyenletnek két egyenlő (kétszeres) gyöke van. Ezek: x1=x2=​−b2a.​ (Szokás helytelenül egy valós gyöknek is mondani.)

		3. Ha D=b2-4ac<0 esetben a másodfokú egyenletnek nincs megoldása a valós számok között.*/
		if (args.length==3)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			if (a!=0)
			{
				double d;// diszkrimináns b2-4ac
				//d=Math.pow(b, 2)-4*a*c;
				d=b*b-4*a*c;
				System.out.println("diszkrimináns:"+d);
				if (d<0)
				{
					System.out.println("A másodfokú egyenletnek nincs megoldása a valós számok között");
				}
				else if (d==0)
				{
					double x=-b/2*a;
					System.out.println("A másodfokú egyenletnek egy megoldásavan X="+x);
				}
				else
				{
					double gyokD=Math.sqrt(d);
					double x1=(-b-(gyokD))/2*a;
					double x2=(-b+(gyokD))/2*a;
					System.out.println("A másodfokú egyenletnek két megoldásavan ");
					System.out.println("x1="+x1);
					System.out.println("x2="+x2);
				}
			}
			else
			{
				System.out.println("Az egyenlent nem másodfokú");
			}
		}
		else
		{
			System.out.println("Három számot kell magadni");
		}
	}

}
