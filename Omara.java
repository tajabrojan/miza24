/**
 * Omara.java
 *
 * Opis:
 * Program za prikaz delovanja GUI
 * na primeru razredov poslovne logike Torba in NavadnaTorba
 *
 */
 
 // Uvozimo vse razrede iz paketa za delo z V/I napravami, pripomočke, GUI in dogodke
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Javni razred za zagon uporabniškega vmesnika
 *
 * @author Taja Brojan
 * @version Vaja 35
 */
public class Omara extends JFrame implements ActionListener {
	
	// Deklaracija zasebnih lastnosti
	private JPanel povrsina;
	private JButton dodajButton;
	private JTextField znamkaVnos;
	private JTextField zepiVnos;
	private JTable tabela;
	private NavadnaTorbaTableModel modelTabele;
	
	/** Javna statična metoda, ki se izvede ob zagonu programa in ne vrača nič (ker je tipa void)
	 * @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
	 */
	public static void main(String[] args) {
		
		// Izpišemo pozdrav v konzolo
		System.out.println("Zaganjam GUI ...");
		
		// Ustvarimo objekt tipa omara (kličemo konstruktor razred Omara)
		Omara o = new Omara();
		
	}
	/** Javni konstruktor za ustvarjanje novega okna s prikazom torb
	 */	
	public Omara() {
		
		// Pokličemo konstruktor nadrazreda
		super("Omara s torbami");
		
		// Nastavimo obnašanje križca (x) tako, da
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Nastavimo velikost okna
		setSize(800,600);
		
		// Inicializiramo lastnosti
		povrsina = new JPanel();
		dodajButton = new JButton("Dodaj torbo v omaro");
		znamkaVnos = new JTextField(32);
		zepiVnos = new JTextField(4);
		modelTabele = new NavadnaTorbaTableModel();
		tabela = new JTable(modelTabele);
		
		// Gumbu za dodajanje dodamo action listener
		dodajButton.addActionListener(this);
		
		// Na površino dodamo vnosna polja z oznako
		povrsina.add(new JLabel("Znamka:"));
		povrsina.add(znamkaVnos);
		povrsina.add(new JLabel("Število žepov:"));
		povrsina.add(zepiVnos);
		
		// Na povšino dodamo gumb
		povrsina.add(dodajButton);
		
		// Na površino dodamo tabelo
		povrsina.add(tabela);
		
		// Na okno dodamo površino
		add(povrsina);
		
		// Napravimo okno vidno
		setVisible(true);
	}
	
	/** Javna metoda, ki izvaja aktivnosti glede na dogodke
	 * @param e Dogodek, ki je sprožil, klical metodo
	 */
	public void actionPerformed(ActionEvent e) {
		
		// Izpišemo indikator klika gumba
		System.out.println("Dodajam torbo ...");
		System.out.println("Znamka: " + znamkaVnos.getText());
		System.out.println("Število žepov: " + zepiVnos.getText());
		
		// Ustvarimo spremenljivko za število žepov
		double sz = Double.parseDouble(zepiVnos.getText());
		
		// Ustvarimo objekt tipa NavadnaTorba
		NavadnaTorba nova = new NavadnaTorba(znamkaVnos.getText(), 20, 80, sz);
		
		// Navadno torbo dodamo v model tabele
		modelTabele.addNavadnaTorba(nova);
	}
}