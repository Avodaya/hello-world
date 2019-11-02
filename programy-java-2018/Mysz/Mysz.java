import java.io.IOException;

public class Mysz {
 
    public static int i;
    public static int j;
    public static int polozenieMyszyKolumna, polozenieMyszyWiersz;
    public static int[][] tab = new int[23][23];
 
    public static void main(String[] args) {
		try {
        wypelnijTabliceZerami();
        wyswietl_Tablice();
		System.in.read();
        wypelnijTabliceJedynkami();
        wyswietl_Tablice();
		System.in.read();
        umiescMyszWTablicy();
        wyswietl_Tablice();
		System.in.read();
        wariant1();
        System.out.println(polozenieMyszyKolumna);
        System.out.println(polozenieMyszyWiersz);
		 } catch (IOException e){
            System.out.println("Error reading from user");
        }
    }
 
    public static void wypelnijTabliceZerami() {
 
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = 0;
            }
        }
        System.out.println();
    }
  
    public static void wyswietl_Tablice() {
 
        for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
 
    }
 
    public static void wypelnijTabliceJedynkami() {
 
        for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int) (Math.random() * 2);
            }
        }
        System.out.println();
    }
  
    public static void umiescMyszWTablicy() {
 
        polozenieMyszyKolumna = (int) (Math.random() * 23);
        polozenieMyszyWiersz = (int) (Math.random() * 23);
        tab[polozenieMyszyKolumna][polozenieMyszyWiersz] = 2;
    }
 
    public static void wariant1() {
		int przesunX, przesunY;
		
		boolean done = false;
		
		while (done == false) {
			tab[polozenieMyszyKolumna][polozenieMyszyWiersz] = 3;

			
			
		do {
				przesunX = (int) (Math.random()*2) * (int) Math.pow(-1,(int) (Math.random() * 100.0 + 1.0));
				przesunY = (int) (Math.random()*2) * (int) Math.pow(-1,(int) (Math.random() * 100.0 + 1.0));
		} while (polozenieMyszyKolumna+przesunX >= 23 || polozenieMyszyWiersz+przesunY >= 23 || polozenieMyszyKolumna+przesunX < 0 || polozenieMyszyWiersz+przesunY < 0 || (przesunX == 0 && przesunY == 0) );
			polozenieMyszyKolumna = polozenieMyszyKolumna + przesunX;
			polozenieMyszyWiersz = polozenieMyszyWiersz + przesunY;
			
			done = true;
			for (i = 0; i < tab.length; i++) {
				for (j = 0; j < tab[i].length; j++) {
					if (tab[i][j] != 3) {
						done = false;
						break;
					}
				}
			}
			tab[polozenieMyszyKolumna][polozenieMyszyWiersz] = 2;
        				
		wyswietl_Tablice();	
		}
    }
}
