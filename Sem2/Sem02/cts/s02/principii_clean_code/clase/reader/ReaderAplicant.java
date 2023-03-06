package cts.s02.principii_clean_code.clase.reader;

import java.io.FileNotFoundException;
import java.util.List;

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
}