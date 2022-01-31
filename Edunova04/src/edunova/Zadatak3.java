package edunova;


public class Zadatak3 {
public static void main(String[] args) {
	// Za uneseni cijeli broj program ispisuje da li je prim broj ili nije
//	int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
//	boolean prim = true;
//	for(int i=2; i<broj;i++) {
//		//System.out.println(broj+"%"+i+"=" +broj%i);
//		
//		if(broj%i==0) {
//			//System.out.println("Nije prim broj");
//		    prim = false;
//			break;
//		}
//	}
//	System.out.println(broj+ ""+(prim ? "je ": "nije") + "prim broj");
	
	// Ispisati sve prim brojeve između 278 i 2455
	
	boolean prim = true;
	
	for(int i = 278; i<=2455;i++) {
		for(int j=0;j<i;j++) {
			
			if(j%i==0) {
				prim = false;
			    break;
			}
		}
	}
	
	
}
}
