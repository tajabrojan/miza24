/**
 * NavadnaTorba.java
 *
 * Opis:
 * Delo z navadnimi torbami
 * 
 * @author Taja Brojan
 * @version Vaja 32
 */

/**
 * Javni razred, ki razširja razred Torba
 */
public class NavadnaTorba extends Torba implements Denar {
	
	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo dodatne zasebne lastonosti, ki so značilne le za navadne torbe
	private String znamka;
	private double steviloZepov;
	
	// Statična lastnost, ki je enaka vsem pivskim steklenicam (vsem objektom razreda)
	private static String material = "Poliuretan"; // Vse navadne torbe so iz poliuretana
	
	/** Javni konstruktor za ustvarjanje novega objekta tipa/razreda PivskaSteklenica
	 * @param z Znamka piva
	 * @param k Kapaciteta v mililitrih
	 * @return Nov objekt tipa pivska steklenica
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
		
		// Inicializiramo privzeto stopnjo alkohola
		steviloZepov = sz;
		
		// Izpišemo podatke
		System.out.println("Navadna torba je znamke " + z);

	}
	
	
	/** Javna metoda, ki vrne stopnjo alkohola
	 * @return Stopnja alkohola
	 */
	 public double getSteviloZepov(){
		
		// Vrnemo stopnjo alkohola
		return steviloZepov;	 
	 }
}