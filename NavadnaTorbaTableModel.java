/**
 * NavadnaTorbaTableModel.java
 *
 * Opis:
 * Razred za prikaz delovanja tabel v GUI
 * na primeru razredov poslovne logike Torba in NavadnaTorba
 *
 */
 
 // Uvozimo vse razrede iz paketa za delo z V/I napravami, pripomočke, GUI, dogodke in tabele
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

/**
 * Javni razred za strukturo tabele navadnih torb na mizi
 *
 * @author Taja Brojan
 * @version Vaja 35
 */
public class NavadnaTorbaTableModel extends DefaultTableModel {
	

	/** Javni konstruktor za ustvarjanje novega modela tabele torb v omari
	 */	
	public NavadnaTorbaTableModel() {
		
		// Pokličemo konstruktor nadrazreda
		super();
		
		// Dodamo stolpce
		addColumn("Znamka");
		addColumn("Število žepov");
		
		// Ustvarimo prvi, testni seznam objektov za dodajanje v tabelo
		Object[] vrstica = new Object[] {"Testna znamka","2"};
		
		// Dodamo prvi, testni vnos (vrstico) v tabelo
		addRow(vrstica);		
		
	}	
	/** Javna metoda, ki doda torbo v tabelo
	 * @param nt Objekt z navadno torbo, ki jo dodajamo v tabelo
	 */	
	public void addNavadnaTorba(NavadnaTorba nt) {
		
		// Ustvarimo seznam objektov za dodajanje v tabelo
		Object[] vrstica = new Object[] {nt.getZnamka(), nt.getSteviloZepov()};
		
		// Dodamo vrstico v tabelo GUI
		addRow(vrstica);
		
	}
}