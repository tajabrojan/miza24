/**
 * SolskaTorba.java
 *
 * Opis:
 * Delo s šolskimi torbami
 * 
 * @author Taja Brojan
 * @version Vaja 32
 */

/**
 * Javni razred, ki razširja razred Torba
 */
public class SolskaTorba extends Torba {
	
	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo dodatne zasebne lastonosti, ki so značilne le za šolske torbe
	private String barva;
	
	// Statična lastnost, ki je enaka vsem pivskim steklenicam (vsem objektom razreda)
	private static String material = "Poliester"; // Vse šolske torbe so iz poliestra
	
	/** Javni konstruktor za ustvarjanje novega objekta tipa/razreda SolskaTorba
	 * @param b Barva torbe
	 * @param k Kapaciteta
	 * @param kv Kvaliteta
	 * @return Nov objekt tipa šolska torba
	 */
	public SolskaTorba(String b, int k, int kv) {
		
		// Pokličemo konstruktor nadrazreda
		super(k, kv, "Zvezek");
		
		// Inicializiramo še dodatne lastnosti podrazreda
		barva = b;
		
		// Izpišemo podatke
		System.out.println("Šolska torba je barve " + b);

	}
}