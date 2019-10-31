import java.net.URL;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
 
 public class Be { 
	public static void main (String[] args) throws IOException {
		String adres, numer, literka;
		Scanner scanIn = new Scanner(System.in);
		System.out.println("Adres obrazka 01 (bez 01.jpg): ");
		adres=scanIn.nextLine();
		System.out.println("Literka - symbol galerii: ");
		literka=scanIn.nextLine();
		
		for (int i=1;i<13;i++) {
			if (i<10) numer = "0" + Integer.toString(i);
			else numer = Integer.toString(i);
			URL url = new URL(adres+numer+".jpg");
			InputStream in = new BufferedInputStream(url.openStream());
			OutputStream out = new BufferedOutputStream(new FileOutputStream(literka+numer+".jpg"));

			for ( int j; (j = in.read()) != -1; ) {
				out.write(j);
			}
			in.close();
			out.close();
		}
		
	}
}
