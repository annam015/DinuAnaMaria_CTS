package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.reader.ReaderAngajat;
import cts.s02.principii_clean_code.clase.reader.ReaderAplicant;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			ReaderAplicant readerAngajat = new ReaderAngajat("angajati.txt");
			listaAngajati = readerAngajat.readAplicanti();
			for(Aplicant angajat : listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
