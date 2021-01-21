package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// deklarovanie a definovanie premennej kariera
		String kariera = "softver developer";
		System.out.println("Moja kariera je: " + kariera);
		
		// deklarovanie a definovanie premennych odpracovaneHodiny, tyzdne a rate
		int hodinyTyzdenne = 40;
		int tyzdneRocne = 50;
		double rate = 42.50;
		
		/*
		 * redefinovanie premennej
		 * kariera = "web developer"
		*/
		
		//deklarovanie a vypocet premennej plat rocne 
		double plat = hodinyTyzdenne * tyzdneRocne * rate;
		//retazenie (concatenate)
		System.out.println("Moj plat ako " + kariera + " v sume " + rate + "€ za hodinu je " + plat + "€ za rok!");
	}
}
