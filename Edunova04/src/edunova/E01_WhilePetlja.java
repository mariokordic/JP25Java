package edunova;

public class E01_WhilePetlja {
public static void main(String[] args) {
	int i = 2;
	
	boolean	uvjet = i <10;
	
	while(uvjet) {
		System.out.println(i);
		i++;
		uvjet = i<10;
	}
	//Češće

	i=2;
	while(i<10) {
		System.out.println(i);
		i++;
	}

	// 3. način
	
	i=2;
	while(i<10) {
		System.out.println(i++);
	}
	
	//continue,break, ugnježđivanje je jenako kao kod for
	
	while(true) {
		System.out.println("Osijek");
		break;
	}
}

}
