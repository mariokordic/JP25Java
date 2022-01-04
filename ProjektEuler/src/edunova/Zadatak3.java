package edunova;

public class Zadatak3 {
//	The prime factors of 13195 are 5, 7, 13 and 29.
//
//	What is the largest prime factor of the number 600851475143 ?
	
	public static void main(String[] args) {

		long n = 600851475143L;

		if (n > 1) {
			long div = 2;
			while (div < n) {
				if (n % div != 0) {
					div++;
				} else {
					n = n / div;
					System.out.println(div);
					div = 2;
					System.out.println(n);
				}
			}
		}
	}

}
