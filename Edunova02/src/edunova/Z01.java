package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	//Program unosis dva cijela broja
	//AKo je njihov zbroj paran broj ispisuje Osijek
	//inače ispisuje Zagreb
	
	public static void main(String[] args) {
		int a,b;
		
		
//		if((a+b)%2 ==0) {
//         System.out.println("Osijek");			
//		}else {
//			System.out.println("Zagreb");
//		}
		
		a=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi"));b=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi"));System.out.println((a+b)%2==0?"Osijek":"Zagreb");
	}
	
}
