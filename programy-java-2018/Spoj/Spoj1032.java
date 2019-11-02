import java.util.*;
import java.lang.*;

class Spoj1032
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		int[] n = new int[t];
		int[] x = new int[t];
		int[] y = new int[t];
		
		for (int i=0; i<t; i++) {
			n[i] = scan.nextInt();
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		for (int i=0; i<t; i++) {
			wypisz(n[i],x[i],y[i]);
			System.out.println();
		}
	}
	
	static void wypisz(int n, int x, int y) {
		for(int i=0;i<n;i++) {
			if (i%x==0 && i%y!=0) System.out.print(i+" ");
		}
	}
}