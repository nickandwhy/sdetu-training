package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		//volanie funkcii
		printName();
		//priradenie vstupnych hodnot
		addNumbers(num1, num2);
		//bud vypis alebo priradenie do premennej 
		System.out.println("Nasobok cisiel " + num1 + " a " + num2 + " je " + multiplyNumbers(num1, num2));
	}
	
	//funkcia
	//void = bez vratnej hodnoty
	public static void printName() {
		System.out.println("Moje meno je Marian");
	}
	//priradenie vstupnych hodnot funkcii
	public static void addNumbers(int inum1, int inum2) {
		int spolu = inum1 + inum2;
		System.out.println("Scitanie cisiel " + inum1 + " a " + inum2 + " je " + spolu);
	}
	//funkcia s vratenim hodnoty
	public static int multiplyNumbers(int valueA, int valueB) {
		int multiple = valueA * valueB;
		return multiple;
	}
}
