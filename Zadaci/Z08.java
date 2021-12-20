package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	// Program unosi dvije logičke vrijednosti
	// u slučaju da su obje istinite ispisuje DA
	

	public static void main(String[] args) {
		
		
		boolean a=Boolean.parseBoolean(
				JOptionPane.showInputDialog("true/false")
				);
		
		boolean b=Boolean.parseBoolean(
				JOptionPane.showInputDialog("true/false")
				);
		
		
		
		
		if(a & b==true) {
			System.out.println("Da");
		} else {
			System.out.println("Ne");
		}
		
		System.out.println(a&b==true ? "Da" : "Ne");
		
		
	}
		
}