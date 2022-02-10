package subota;

import java.util.Scanner;

public class Zadaci {

	public Zadaci(){
		//zadatak1();
		//System.out.println(zadatak2(2,"Osijek"));
		//zadatak3();
		//zadatak4();
		
	}

	public static void main(String[] args) {
		new Zadaci();
	}
	
	private void zadatak1 () {
		//Učitati tekst koje je minimalne dužine pet znakova
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi poruku");
		String text = ulaz.nextLine();
		while(text.length() < 5) {
			System.out.println("Unio si manje od 5 znakova");
			text = ulaz.nextLine();
		}
		ulaz.close();
	}
	
	private char zadatak2(int index,String b) {
		//Metoda vraća znak koji se nalazi na primljenom indexu.
		System.out.println(index);
		System.out.println(b);
		
		return b.charAt(index-1);
	}
	//Zadatak 3 ne prima niti jedan parametar tipa void
	private void zadatak3() {
	//Ispiši sve neparne brojeve od 56 do 12 do while petljom
		int i=56,y=12;
		do{
		if(i%2==1) {
			System.out.println(i);
		}
		}while (i-->y);
		
	}
	private void zadatak4() {
		int i=1,j=2,k=0;
		k=++i + j--;
		i= k - ++j;
		System.out.println(i+j+k);
	}
	
	
}
