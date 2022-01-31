package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
//Program unosis brojeve sve dok se ne unese broj -1
//ostali negativno upisani brojevi se preskaču
//program ispisuje;
//1. Suma svih brojeva
//2.Prosjek svih brojeva
//3.Najmanji broj
//4.Najveci broj
//5. Jedan slučajno odabran uneseni broj
	public static void main(String[] args) {
		int suma = 0;
		int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
		int i=0;
		float prosjek;
		while(true) {
			
			int broj= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj")); 
		    
			if(broj == -1) {
				break;
			}
			suma +=broj;
			
			if(broj>max) {
				max = broj; 
			}
		    
			if (broj<min) {
				min = broj;
			}
			i++;
		}
		prosjek = (float)suma/i;
		System.out.println("Suma je jednaka "+suma);
		System.out.println("Prosjek je jednak " +prosjek);
		System.out.println("Max je" + max);
		System.out.println("Min je" + min);
	}	
}
