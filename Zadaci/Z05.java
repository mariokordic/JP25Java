package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	
	//Program učitava od korisnika cijeli broj između 10 i 20.
	//Program ispisuje jedinični dio upisanog broja


	public static void main(String[] args) {
		
			int a=Integer.parseInt(
					JOptionPane.showInputDialog("Učitaj broj")
					);
		
			int b = a % 10;
			
			System.out.println(b);
		
		
	}
	
	
}