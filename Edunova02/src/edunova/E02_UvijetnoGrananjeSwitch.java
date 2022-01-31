package edunova;

import javax.swing.JOptionPane;

public class E02_UvijetnoGrananjeSwitch {
public static void main(String[] args) {
	int ulaz =Integer.parseInt(JOptionPane.showInputDialog("Odabrite akciju: \n1 zbrajanje \n2 dijeljenje"));
	
	int rez = switch(ulaz) {
	case 1,2,3 -> 10;
	case 4,5 -> 20;
	default -> 0;
	};
	System.out.println(rez);
}
	
}
