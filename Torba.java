/**
 * Torba.java
 *
 * Opis:
 * Delo s torbo
 * 
 * @author Taja Brojan
 * @version Vaja 32
 */

/**
 * Javni razred za prikaz dela z razredi in objekti
 */
public class Torba {
	
	// Deklariramo zasebne lastonosti torbe
	private int kapaciteta; 	
	private boolean jeOdprta;
	private boolean joNosimo;
	private int kvaliteta;
	private int kvalitetaTorbe;
	private String vrstaVsebine;
	private int kolicinaVsebine; 
	
	/** Javni konstruktor za ustvarjanje novega objekta tipa/razreda Torba
	 * @param k Kapaciteta torbe
	 * @param v Vrsta vsebine torbe
	 * @return Nov objekt tipa torbe
	 */
	public Torba(int k, int kv, String v) {
		
		// Inicializiramo lastnosti
		kapaciteta = k;
		jeOdprta = false;
		vrstaVsebine = v;
		kolicinaVsebine = k;
		joNosimo = false;
		kvaliteta = kv;
		kvalitetaTorbe = kv;
		
		
		// Izpišemo podatke
		System.out.println("Ustvarjam objekt tipa Torba kapacitete " + k + " z vsebino " + v + " in kvaliteto " + kv + ".");
	}

	/** Javna metoda, ki izprazni vsebino iz torbe
	 * @param k Količina, ki jo želimo izprazniti
	 * @return Vsebina torbe
	 */
	public String izprazni(int k) throws Exception {
		
		// Če je torba odprta
		if(jeOdprta){
			
			// Zmanjšamo količino vsebine za odvzeto količino
			System.out.println("Količina pred praznenjem: " + kolicinaVsebine);
			kolicinaVsebine = kolicinaVsebine - k;
			System.out.println("Količina po praznenju: " + kolicinaVsebine);
			
			// Vrnemo vrsto vsebine
			return vrstaVsebine;
		}
		// Če je torba zaprta, vrne prazno vsebino
		else {
			throw new Exception("Ne morem izprazniti torbe, ker je zaprta.");
		
		}
	}
	/** Javna metoda, ki odpre torbo
	 * @return Vrne true, če je bilo odpiranje uspešno ali false, če je bila torba že odprta
	 */
	public boolean odpri() {
		
		// Če je torba odprta
		if(jeOdprta){
			
			// Vrnemo false (ker je bila že odprta)
			return false;
		}
		// Če je torba zaprta
		else {
			
			// Spremenimo lastnost (jo odpremo)
			jeOdprta = true;
			
			// Vrnemo true (ker je bilo odpiranje uspešno)
			return true;		
		}
	}
	
	/** Javna metoda, ki doda vsebino v torbi
	 * @param k Količina, ki jo želimo napolniti
	 * @return Vsebina torbe
	 */
	public String dodaj(int k) throws Exception {
		
		// Če je torba odprta
		if(jeOdprta){
			
			// Zmanjšamo količino vsebine za odvzeto količino
			System.out.println("Količina pred dodajanjem: " + kolicinaVsebine);
			kolicinaVsebine = kolicinaVsebine + k;
			System.out.println("Količina po dodajanju: " + kolicinaVsebine);
			
			// Vrnemo vrsto vsebine
			return vrstaVsebine;
		}
		// Če je torba zaprta, vrne prazno vsebino
		else {
			throw new Exception("Ne morem dodajati v torbo, ker je zaprta.");
		
		}
	}
	
	/** Javna metoda za nošenje torbe
	 * @return Vrne true, če je bilo nošenje uspešno ali false, če je 
	 */
	public boolean nosi() {
		
		// Če je torba nošena
		if(joNosimo){
			
			// Vrnemo false
			return false;
		}
		// Če torba ni nošena
		else {
			
			// Spremenimo lastnost (jo nosimo)
			joNosimo = true;
			
			// Vrnemo true (ker je bilo nošenje uspešno)
			return true;		
		}
	}
	
	/** Javna metoda, ki opredeljuje nošenje torbe
	 * @param kv Kvaliteta torbe
	 * @return Vsebina torbe
	 */
	public String obraba(int kv) {
		
		// Če je torba nošena
		if(joNosimo){
			
			// Zmanjšamo kvaliteto za toliko kolikor se je zmanjšala pri nošenju
			System.out.println("Kvaliteta pred nošenjem: " + kvalitetaTorbe);
			kvalitetaTorbe = kvalitetaTorbe - kv;
			System.out.println("Kvaliteta po nošenju: " + kvalitetaTorbe);
			
			// Vrnemo vrsto vsebine
			return vrstaVsebine;
		}
		// Če torba ni nošena, vrne prazno vsebino
		else {
			System.out.println("Torba ni bila nošena, zato ni še nič obrabljena.");
			return "";
		
		}
	}

}