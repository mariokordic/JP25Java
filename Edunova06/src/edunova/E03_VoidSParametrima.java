package edunova;

public class E03_VoidSParametrima {
public static void main(String[] args) {
   zbroj(3,3);
   primBrojevi(5, 50);
   primBrojevi(50);
}
public static void zbroj(int i, int j) {
	System.out.println(i+j);
}

protected static void primBrojevi(int min, int max) {
	boolean prim;
	for(int i=min;i<=max;i++) {
		prim=true;
		for(int j=2; j<i;j++) {
			if(i%j==0) {
				prim = false;
				break;
			}
		}
		if(prim) {
			System.out.println(i);
		}
	}
}
// metod overloading
private static void primBrojevi(int max) {
	primBrojevi(2,max);
}
}
