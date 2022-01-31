package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
  // Program prima dva broja  i ispisuje sve brojeve jedno ispod drugog
  //između dva primljena broja od manjeg prema većem
	
	public static void main(String[] args) {
	
		int a,b,i;
		a=Integer.parseInt(JOptionPane.showInputDialog("Upisi prvi broj"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		if(a>b) {
			for(i = b; i<a; i++) {
				System.out.println(i);
			}
		}
	
		if(b>a) {
			for(i = a; i<b; i++) {
				System.out.println(i);
			}
		} 		
		
}
}
