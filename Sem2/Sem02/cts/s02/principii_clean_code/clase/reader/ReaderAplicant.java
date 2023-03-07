package cts.s02.principii_clean_code.clase.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;

public abstract class ReaderAplicant {
	private String numeFisier;
	
	public ReaderAplicant(String file) {
		this.numeFisier = file;
	}
	
	public String getNumeFisier() {
		return this.numeFisier;
	}
	
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
	public void citesteAplicant(Scanner scanner, Aplicant aplicant) {
		aplicant.setNume(scanner.next());
		aplicant.setPrenume(scanner.next());
		aplicant.setVarsta(scanner.nextInt());
		aplicant.setPunctaj(scanner.nextInt());
		aplicant.setNr_proiecte(scanner.nextInt());
		String[] denumiriProiecte = new String[aplicant.getNr_proiecte()];
		for (int i = 0; i < denumiriProiecte.length; i++)
			denumiriProiecte[i] = scanner.next();
		aplicant.setDenumiriProiecte(denumiriProiecte);		
	}
}