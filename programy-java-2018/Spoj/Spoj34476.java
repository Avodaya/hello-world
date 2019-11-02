import java.util.*;
import java.lang.*;

class Spoj34476
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		String zakodowane = scan.nextLine();
		int dl = zakodowane.length();
		for (int i=0; i<dl; i+=2) {
			System.out.print((char)((zakodowane.charAt(i+1)+zakodowane.charAt(i))%26+'A'));
		}
		
	}
}