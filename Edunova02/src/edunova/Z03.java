package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	public static void main(String[] args) {
		boolean ulaz1 =Boolean.parseBoolean(JOptionPane.showInputDialog("Unos 1"));
		boolean ulaz2 =Boolean.parseBoolean(JOptionPane.showInputDialog("Unos 2"));

		if(ulaz1 == true && ulaz2 == true) {
			System.out.println("DA");
		}	
	}
	
}
