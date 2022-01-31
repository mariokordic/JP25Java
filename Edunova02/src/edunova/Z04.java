package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
	     int sirina =Integer.parseInt(JOptionPane.showInputDialog("Unos sirinu"));
		 int duzina =Integer.parseInt(JOptionPane.showInputDialog("Unos duzinu"));
		 
		 int povrsina = sirina * duzina;
		 
		 if(povrsina <= 6500 && povrsina <= 7000) {
			 System.out.println("Nogomet");
		 }
		 if(povrsina < 800 ) {
			 System.out.println("Rukomet");
		 }
		 
		 if(povrsina > 7000) {
			 System.out.println("Ragbi");
		 }
		 

	}
	
}
