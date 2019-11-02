import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis{
    public static void main(String[] args) throws FileNotFoundException{
        int miesiac;
		int dzien;
		int komorka;
		int liczbadni;
		String tekst1;
        String tekst2;
        String tekst3=".xlsx]WYNIKI'!F";
		String wynik;
		
		PrintWriter zapis = new PrintWriter("excel.txt");
        
		for (miesiac=9;miesiac<13;miesiac++) {		
				tekst1="='C:\\Users\\kpedzinski\\Downloads\\Ceny\\";
				tekst2="-2018\\[Raport RDN dzień dostawy_delivery day 2018_";
			if (miesiac%2>0) {
				liczbadni = 30;
			} else liczbadni = 31;
			
			if (miesiac<10) {
						tekst1 = tekst1 + '0';
						tekst2 = tekst2 + '0';
			}
			
			for (dzien=1;dzien<=liczbadni;dzien++) {
				for(komorka=13;komorka<37;komorka++) {
					if(dzien<10) {
						wynik = tekst1+miesiac+tekst2+miesiac+"_0"+dzien+tekst3+komorka;
					} else {
						wynik = tekst1+miesiac+tekst2+miesiac+'_'+dzien+tekst3+komorka;
					}
					zapis.println(wynik);
				}
				//zmiana czasu w pazdzierniku
				if (miesiac==10 && dzien==28) {
					wynik = tekst1+miesiac+tekst2+miesiac+'_'+dzien+tekst3+"37";
					zapis.println(wynik);
				}
			}
		}
		
		zapis.close();
    }
}