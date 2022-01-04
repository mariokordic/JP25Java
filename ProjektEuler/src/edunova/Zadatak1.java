package edunova;

public class Zadatak1 {
public static void main(String[] args) {
	int suma = 0, i;
	
	for(i=1;i<1000;i++) {
		if(i%3==0 && i%5==0) {
			suma+=i;
			System.out.println(i);
		}
	}
	System.out.println(suma);
}
}
