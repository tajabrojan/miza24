/**
 * UporabaTorbe.java
 *
 * Opis:
 * Program, ki služi prikazu delovanja razredov in objektov
 *
 * @author Taja Brojan
 * @version Vaja 34
 */
 
 // Uvozimo vse razrede iz paketa za delo z V/I napravami
import java.io.*;
import java.util.*;
/**
 * Javni razred za prikaz delovanja jave
 */
public class UporabaTorbe {
	
	// Deklariramo lastnost (objekt) za vnos iz konzole
	private static BufferedReader in;
	
	// Abstraktni seznam objektov razreda SolskaTorba
	private static ArrayList<SolskaTorba> solskeTorbe;
	
	// Abstraktni seznam objektov razreda NavadnaTorba
	private static ArrayList<NavadnaTorba> navadneTorbe;
	
	/** Javna statična metoda, ki se izvede ob zagonu programa
	 * @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
	 * @return Metoda ne vrača nič (ker je tipa void)
	 */
	
	public static void main(String[] args) {
		
		// Inicializiramo statično lastnost za vnos iz tipkovnice
		// Konstruktor kot vhodni parameter prejme anonimni objekt razreda InputStreamReader
		in = new BufferedReader(new InputStreamReader(System.in));
		
		// Inicializiramo seznam šolskih torb
		solskeTorbe = new ArrayList<SolskaTorba>();
		
		// Inicializiramo seznam navadnih torb
		navadneTorbe = new ArrayList<NavadnaTorba>();
		
		// Ustvarimo tri objekta tipa/razreda torba
		Torba zvezek = new Torba(15, 100, "zvezki");
		Torba knjiga = new Torba(10, 80, "knjige");
		Torba pisalo = new Torba(20, 70, "pisala");
		
		// Deklariramo in inicializiramo spremenljivko za količino zvezkov
		int sz = 0;
		
		// Poskusimo prebrati niz s tipkovnice
		try {
			System.out.print("Koliko zvezkov naj dodam v torbo?");
			
			// Niz, vnešen preko tipkovnice, preberemo v spremenljivko
			String steviloZvezkov = in.readLine();
			
			// Niz zapišemo v celo število
			sz = Integer.parseInt(steviloZvezkov);
			
			System.out.println("V torbo bom dodal " + steviloZvezkov + " zvezkov.");
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri vnosu: " + e);
		}
		// Iz torbe z zvezki poskusimo izprazniti toliko, kot smo vnesli v konzoli 
		// (kličemo metodo izprazni objekta zvezek)
		try {
			String vsebinaTorbe = zvezek.izprazni(sz);
			System.out.println("Vsebina torbe z zvezki je " + vsebinaTorbe);
		
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri praznjenju torbe z zvezki: " + e);
		}
		
		// Odpremo torbo z knjigami
		knjiga.odpri();
		
		// Iz torbe s knjigami vzamemo 5 knjig
		try {
			String knjige = knjiga.izprazni(5);
			System.out.println("Iz torbe s knjigami smo vzeli " + knjige + ".");
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri praznenju torbe s knjigami: " + e);
		}
		
		// Odpremo torbo s pisali
		pisalo.odpri();
		
		// Iz torbe s pisali vzamemo 10 pisal
		try {
			String pisala = pisalo.dodaj(10);
			System.out.println("V torbo s pisali smo dodali " + pisala + ".");
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri dodajanju v torbo s pisali: " + e);
		}
		
		// Nosimo torbo z zvezki
		zvezek.nosi();
		
		// Torbi z zvezki zmanjšamo kvaliteto, zaradi nošenja
		String zvezki = zvezek.obraba(20);
		System.out.println("Nosili in obrabili smo torbo z " + zvezki + ".");
		
		// Ustvarimo tri šolske torbe
		SolskaTorba crna = new SolskaTorba("Črna", 20, 100);
		SolskaTorba modra = new SolskaTorba("Modra", 15, 80);
		SolskaTorba siva = new SolskaTorba("Siva", 10, 70);
		
		// Torbe dodamo v seznam
		solskeTorbe.add(crna);
		solskeTorbe.add(modra);
		solskeTorbe.add(siva);
		
		// Odpremo vse torbe v seznamu
		for(int c=0; c<solskeTorbe.size(); c++) {
			
			if(solskeTorbe.get(c).odpri()) {
				System.out.println("Šolska torba št. " + c + " uspešno odprta");
			}
		}
		
		// Kličemo metodo, ki so bile deklarirane že v nadrazredu
		try {
			crna.odpri();
			System.out.println("Iz torbe smo vzeli " + crna.izprazni(5));
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri praznjenju črne torbe: " + e);
		}
		// Ustvarimo tri navadne torbe
		NavadnaTorba guess = new NavadnaTorba("Guess", 50, 80);
		NavadnaTorba valentino = new NavadnaTorba("Valentino", 30, 85);
		NavadnaTorba davidJones = new NavadnaTorba("David Jones", 20, 100);
		
		// Torbe dodamo v seznam
		navadneTorbe.add(guess);
		navadneTorbe.add(valentino);
		navadneTorbe.add(davidJones);
		
		// Dodamo novo navadno torbo z številom žepov, ki jih ima
		navadneTorbe.add(new NavadnaTorba("Desigual", 15, 90, 2));
		
		// Deklariramo in inicializiramo spremenljivke
		int kd = 0;
		int kt = 0;

		// Poskusimo prebrati niz s tipkovnice
		try {
			
			while(true) {
			
			System.out.print("Torbo katere znamke naj dodam na seznam?");
			String znamkaTorbe = in.readLine();
			
			System.out.print("Koliko denarja je v torbi?");
			String kolicinaDenarja = in.readLine();
			kd = Integer.parseInt(kolicinaDenarja);
			
			System.out.print("Kolikšna je kvaliteta torbe?");
			String kvalitetaTorbe = in.readLine();
			kt = Integer.parseInt(kvalitetaTorbe);
			
			navadneTorbe.add(new NavadnaTorba(znamkaTorbe, kd, kt));
			
			}
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri vnosu: " + e);
		}
		
		// Odpremo vse torbe v seznamu
		for(int c=0; c<navadneTorbe.size(); c++) {
			
			if(navadneTorbe.get(c).odpri()) {
				System.out.println("Navadna torba št. " + c + " uspešno odprta");
			}
		}
		
		// Kličemo metode, ki so bile deklarirane že v nadrazredu
		try {
			valentino.odpri();
			System.out.println("V torbo smo dodali " + valentino.dodaj(20));
		}
		catch(Exception e) {
			System.out.println("Prišlo je do napake pri dodajanju v torbo znamke Valentino: " + e);
		}
	}
}