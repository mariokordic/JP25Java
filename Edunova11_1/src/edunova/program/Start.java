package edunova.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;
import edunova.utility.Unos;

public class Start {

	private List<Smjer> smjerovi;
	private List<Grupa> grupe;
	private List<Predavac> predavaci;
	private List<Polaznik> polaznici;
	
	private Scanner ulaz;
	
	
	public Start() {
		smjerovi = new ArrayList<>();
		grupe = new ArrayList<>();
		predavaci = new ArrayList<>();
		ulaz = new Scanner(System.in);
        naslov();
        glavniIzbornik();
 	}
	
	private void glavniIzbornik() {
		System.out.println("1.Rad s smjerovima");
		System.out.println("2. Rad s grupama");
		System.out.println("3. Rad s predavačima");
		System.out.println("4. Rad s polaznicima");
		System.out.println("5. Kraj rada ");
		switch(Unos.unesiInt(ulaz, ""))
		
	}

	private void naslov() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Start();
	}
}
