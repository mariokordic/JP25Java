package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {
// Program učitva 5 cijelih brojeva foreach petljom ispisuje sve učitane broje ispisuje prosjek učitanih brojeva
	public static void main(String[] args) {
	int niz[] = new int[5];
	int suma=0;
	for(int i=0;i<5;i++) {
		niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Učitaj cijeli broj"));
		suma+=niz[i];
	}
	
	for(int i : niz) {
		System.out.println(i);
	}
	
	float prosjek = (float) suma / 5;
	System.out.println(prosjek);
}
}
