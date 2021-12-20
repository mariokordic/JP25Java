package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	// Napišite program koji za danu širinu i dužinu igrališta ispisuje 
	// koji se sportovi na tom igralištu mogu igrati
	// Sportovi se igraju na sljedećim površinama igrališta
	// Nogomet 6500 – 7000 m2
	// Rukomet 800 m2
	// Ragbi 7000 m2

	
	public static void main(String[] args) {
		
	 double sirina=Double.parseDouble(
			 JOptionPane.showInputDialog("Sirina")
			 );
	 double duzina=Double.parseDouble(
			JOptionPane.showInputDialog("Duzina")
			);
		
	 double kvadrat = sirina * duzina;
		
		
	 if(kvadrat>=6500) {
		 System.out.println("Nogomet");
	 }else if(kvadrat<=800) {
		 System.out.println("Rukomet");
	 }else if(kvadrat==7000) {
		 System.out.println("Ragbi,Nogomet");
	 }else if(kvadrat>7000) {
		 System.out.println("Nogomet,Rukomet,Ragbi");
	 }
	 
	
	}

}