import java.util.*;
import java.lang.*;

class Spoj438	
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] liczby = new int[n];
		
		for (int i = 0; i<n;i++) {
			liczby[i] = scan.nextInt();
		}
		
		for (int i = 0; i<n;i++) {
			if (testPierwszosci(liczby[i]) == true) {
				System.out.println("TAK");
			}
			else {
				System.out.println("NIE");
			}
		}		
	}
	
	static boolean testPierwszosci(int n) {
				if(n<2)
		return false; //gdy liczba jest mniejsza niż 2 to nie jest pierwszą
		
	for(int i=2;i*i<=n;i++)
		if(n%i==0)
			return false; //gdy znajdziemy dzielnik, to dana liczba nie jest pierwsza
	return true;		
		}
}