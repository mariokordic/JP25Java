package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	//Program prima jedan broj i ispisuje sve parne brojeve
	//od primljenog broja do broja 2 jedno pokraj drugog odvojeno zarezom.
	//Zadnji zarez se ne ispisuje
	public static void main(String[] args) {
		int broj;
		
		broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		for(int i = broj; i>2;i--) {
			if(i%2 == 0) {
				System.out.print(i+",");
			}
		}
		System.out.println("2");
	}

}
