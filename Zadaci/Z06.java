package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program unosi dva cijela broja
	// Ako je njihov zbroj paran broj ispisuje Osijek
	// inače ispisuje Zagreb
	public static void main(String[] args) {
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj"));
		int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
		
		int suma = broj1+broj2;
		
		if((suma %2)==0) {
			System.out.println("Osijek");
		}else{
			System.out.println("Zagreb");
		}
		

		System.out.println((broj1+broj2)%2==0?"Osijek":"Zagreb");
	}

}
