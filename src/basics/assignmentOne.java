package basics;

public class assignmentOne {
	public static void main(String[] args) {
		//prva otazka
		scitanie(5);
		//druha otazka
		System.out.println("factorial 1. sposob " + factorial(5));
		System.out.println("factorial 2. sposob " + fact(5));
		//tretia otazka
		int[] hodnoty = {5, 100, 20, 35, 78};
		System.out.println("Minimalne hodnoty v poli su: " + min(hodnoty) + " a maximalne: " + max(hodnoty) + " a priemer pola je " + avr(hodnoty));
	}
	
	//prva otazka
	public static void scitanie(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	//druha otazka
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
		fact = fact * i;
		}
		return fact;
	}
	
	//iny sposob
	public static int fact(int n) {
		if (n == 0) {
		return 1;
		}
		return fact(n-1)*n;
	}
	
	
	//tretia otazka
	public static int min(int[] iHodnoty) {
		int min = iHodnoty[0];
		for (int i = 0; i < iHodnoty.length; i++) {
			if (iHodnoty[i] < min) {
				min = iHodnoty[i];
			}
		}
		return min;
	}
	
	public static int max(int[] jHodnoty) {
		int max = 0;
		for (int j = 0; j < jHodnoty.length; j++) {
			if (jHodnoty[j] > max) {
				max = jHodnoty[j];
			}
		}
		return max;
	}
	
	public static int avr(int[] kHodnoty) {
		int avr = 0;
		for (int k = 0; k < kHodnoty.length; k++) {
			avr = avr + kHodnoty[k];
		}
		return avr / kHodnoty.length;
	}
}

