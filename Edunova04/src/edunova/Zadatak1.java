package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//Program unosi broj između 1 i 10 i ispisuje ga
	
	public static void main(String[] args) {
//		int i;
//		while(true) {
//			i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 10"));
//			if(i<1 || i>10) {
//				JOptionPane.showMessageDialog(null, "Broj nije u traženom rasponu");
//				continue;
//			}
//			System.out.println(i);
//			break;
//		}
//	}
	
	// podzadatak: Istu funcionalnost realizirati s for petljom
	
	for(;;) {
		int i;
		i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 10"));
		if(i<1 || i>10) {
			JOptionPane.showMessageDialog(null, "Broj nije u traženom rasponu");
			continue;
		}
		System.out.println(i);
		break;
		}
	}

}
