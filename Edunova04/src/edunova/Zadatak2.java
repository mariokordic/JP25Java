package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
 // Za upisani cijeli broj ispisati samo prvu znamenku
	
	// 15262 -> 1
	// 874 -> 8
	public static void main(String[] args) {
//		int i;
//		i = Integer.parseInt(JOptionPane.showInputDialog("Učitaj cijeli broj"));
//		
//		while(i/10 >0) {
//			i=i/10;
//			
//		}
//		System.out.println(i);
//	}
	
	int i;
	i = Integer.parseInt(JOptionPane.showInputDialog("Učitaj cijeli broj"));
	System.out.println(i%10);
}
}
