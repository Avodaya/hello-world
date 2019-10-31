import java.util.*;
import java.lang.*;

class Kalkulator
{
	int iloscOperacji;
	float[] liczby;
	Scanner scan = new Scanner(System.in);
		
	void start() {
		System.out.print("Ile operacji wykonac: ");
		
		do {
			try {
				iloscOperacji = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("Nieprawidlowa wartosc. Wpisz liczbe wieksza od 0.");				
			}
		} while (iloscOperacji<=0);
	}
	void pobierzLiczby() {
		liczby = new float[iloscOperacji+1];
		
		
		for (int i = 0; i < iloscOperacji+1; i++) {
			try {
				System.out.println("Podaj " + (i+1) + " liczbe: ");
				liczby[i] = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("Nieprawidlowa wartosc. Wpisz liczbe.");
				i--;
			}
		}
		
	}
	
	float kalkuluj() {
		float wynikPop=liczby[0];
		for (int i=1; i < iloscOperacji+1; i++) {
			wynikPop = wyborOperacji(wynikPop,liczby[i]);
		}
		System.out.println("Wynik ostateczny: " +wynikPop);
		return wynikPop;
	}
	float wyborOperacji(float x, float y) {
		System.out.println("Wybierz operacje:    "+x+" <operacja> "+y);
		System.out.println("0. Zamien liczby miejscami");
		System.out.println("1. Dodawanie");
		System.out.println("2. Odejmowanie");
		System.out.println("3. Mnozenie");
		System.out.println("4. Dzielenie");
		
		int wybor = -1;
		
		try {
			wybor = scan.nextInt();
		} catch (InputMismatchException e) {
			scan.nextLine();
		}
		
		switch (wybor) {
			case 0:
				for (int i = 0; i < 50; ++i) System.out.println();
				return wyborOperacji(y,x);
			case 1:
				for (int i = 0; i < 50; ++i) System.out.println();
				return x+y;
			case 2:
				for (int i = 0; i < 50; ++i) System.out.println();
				return x-y;
			case 3:
				for (int i = 0; i < 50; ++i) System.out.println();
				return x*y;
			case 4:
				for (int i = 0; i < 50; ++i) System.out.println();
				return x/y;
			default:
				return wyborOperacji(x,y);
		}
	}
}

class KalkulatorTester
{
	public static void main (String[] args) throws java.lang.Exception {
		Kalkulator k = new Kalkulator();
		
		k.start();
		k.pobierzLiczby();
		k.kalkuluj();
	}
}