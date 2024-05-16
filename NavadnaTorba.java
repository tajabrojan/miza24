/**
 * NavadnaTorba.java
 *
 * Opis:
 * Delo z navadnimi torbami
 * 
 * @author Taja Brojan
 * @version Vaja 35
 */

/**
 * Javni razred, ki razširja razred Torba
 */
public class NavadnaTorba extends Torba implements Denar {
	
	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo dodatne zasebne lastonosti, ki so značilne le za navadne torbe
	private String znamka;
	private double steviloZepov;
	
	// Statična lastnost, ki je enaka vsem navadnim torbam (vsem objektom razreda)
	private static String material = "Poliuretan"; // Vse navadne torbe so iz poliuretana
	
	/** Javni konstruktor za ustvarjanje novega objekta tipa/razreda NavadnaTorba
	 * @param z Znamka torbe
	 * @param k Kapaciteta
	 * @return Nov objekt tipa navadna torba
	 */
	public NavadnaTorba(String z, int k, int kv) {
		
		// Pokličem drug konstruktor tega istega razreda
		this(z, k, kv, 3);
	}
	
	/** Javni konstruktor za ustvarjanje novega objekta tipa/razreda NavadnaTorba
	 * @param z Znamka torbe
	 * @param k Kapaciteta
	 * @return Nov objekt tipa navadna torba
	 */
	public NavadnaTorba(String z, int k, int kv, double sz) {
		
		// Pokličemo konstruktor nadrazreda
		super(k, kv, "Denar");
		
		// Inicializiramo še dodatne lastnosti podrazreda
		znamka = z;
		
		// Inicializiramo privzeto stevilo žepov
		steviloZepov = sz;
		
		// Izpišemo podatke
		System.out.println("Navadna torba je znamke " + z);

	}
	
	
	/** Javna metoda, ki vrne število žepov
	 * @return Število žepov
	 */
	 public double getSteviloZepov(){
		
		// Vrnemo število žepov
		return steviloZepov;	 
	 }
	 
	 /** Javna getter metoda, ki vrne znamko torbe
	 * @return Znamka torbe
	 */
	public String getZnamka() {
		
		// Vrnemo znamko
		return znamka;
	 }
}