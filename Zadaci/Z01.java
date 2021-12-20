package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program učitava dva cijela broja i ispisuje njihovu razliku
	
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(
				JOptionPane.showInputDialog("Učitaj broj")
				);
		
		int b = Integer.parseInt(
				JOptionPane.showInputDialog("Učitaj broj")
				);
		
		int c = a-b;
		
		System.out.println(c);
		
	}
	
}