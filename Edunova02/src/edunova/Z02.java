package edunova;

import javax.swing.JOptionPane;

public class Z02 {
     //Program unosi 3 cijela broja i ispisuje najmanji
	public static void main(String[] args) {
		int a,b,c,min;
		a=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Unesi treci"));
		
//		if(a<b && a<c) {
//		    System.out.println(a);
//		}
//		else if(b<a && b<c) {
//			System.out.println(b);
//		}
//		
//		else {
//			System.out.println(c);
//		}
		System.out.println((a<b && a<c) ? a : (b<a && b<c) ? b : c  );
		
	}
	
}
