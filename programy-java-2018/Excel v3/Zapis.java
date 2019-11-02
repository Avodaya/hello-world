import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis{
    public static void main(String[] args) throws FileNotFoundException{
        int miesiac;
		int dzien;
		int wartosc;
		int liczbadni;
		String[] komorka = {"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		//"A", "B", "C",
	//	String[] komorka =	 {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', "AA"};
		String tekst1;
        String tekst2=".xlsx]Nowa Prognoza (2)'!";
		String wynikRDN;
		String wynikRB;
		
		PrintWriter zapisRDN = new PrintWriter("RDN.txt");
		PrintWriter zapisRB = new PrintWriter("RB.txt");
        
		for (miesiac=1;miesiac<13;miesiac++) {		
				tekst1="='C:\\Users\\xksrg\\Desktop\\ceny\\[TGE_RDN_2018";
				
			if (miesiac%2>0) {
				liczbadni = 30;
			} else liczbadni = 31;
			
			if (miesiac<10) {
						tekst1 = tekst1 + '0';
			}
			
			for (dzien=1;dzien<=liczbadni;dzien++) {
				for(wartosc=0;wartosc<24;wartosc++) {
					if(dzien<10) {
						wynikRDN = tekst1+miesiac+"0"+dzien+tekst2+komorka[wartosc]+"8";
						wynikRB = tekst1+miesiac+"0"+dzien+tekst2+komorka[wartosc]+"9";
					} else {
						wynikRDN = tekst1+miesiac+dzien+tekst2+komorka[wartosc]+"8";
						wynikRB = tekst1+miesiac+dzien+tekst2+komorka[wartosc]+"9";
					}
					zapisRDN.println(wynikRDN);
					zapisRB.println(wynikRB);
				}
				//zmiana czasu w pazdzierniku
			//	if (miesiac==10 && dzien==28) {
			//		wynik = tekst1+miesiac+tekst2+miesiac+'_'+dzien+tekst3+"37";
			//		zapis.println(wynik);
			//	}
			}
		}	
		zapisRDN.close();
		zapisRB.close();
    }
}