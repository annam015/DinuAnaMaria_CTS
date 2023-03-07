package cts.s02.principii_clean_code.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

public class ReaderStudent extends ReaderAplicant{
	public ReaderStudent(String file) {
		super(file);
	}
	
	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.getNumeFisier()));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student = new Student();
			super.citesteAplicant(input, student);
			student.setAn_studii(input.nextInt());
			student.setFacultate((input.next()).toString());
			studenti.add(student);
		}
		input.close();
		return studenti;
	}
}
