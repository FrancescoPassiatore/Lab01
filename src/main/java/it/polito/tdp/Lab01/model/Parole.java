package it.polito.tdp.Lab01.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	LinkedList<String> parole = new LinkedList<String>();
	
	public Parole() {
		
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole, new ComparatoreOrdineAlfabetico());
		return parole;
	}
	
	public void reset() {
		parole.clear();}
	
	public void removeParola( String p) {
		parole.remove(p);
	}

}