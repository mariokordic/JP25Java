package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	// Program unosi 3 cijela broja i ispisuje najmanji

	public static void main(String[] args) {
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Učitaj cijeli broj a"));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Učitaj cijeli broj b"));
		int broj3 = Integer.parseInt(JOptionPane.showInputDialog("Učitaj cijeli broj c"));
		
		
		if(broj1<broj2 && broj1<broj3) {
			System.out.println(broj1);
		}
		if(broj2<broj1 && broj2<broj3) {
			System.out.println(broj2);
		}
		if(broj3) {
		}
		}
	}
}
