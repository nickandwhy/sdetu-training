package basics;

public class Strings {
	public static void main(String[] args) {
		String nazovKnihy;
		String vyberSlova = "prsten";
		nazovKnihy = "Pan prstenov";
		
		if (nazovKnihy.contains(vyberSlova)) {
			System.out.println("Nazov knihy obsahuje slovo " + vyberSlova);
		}
		
		String prehliadac = "Chrome";
		//equalsIgnoreCase - nachadza retazec znakov a ignoruje velkost pismen
		if(prehliadac.equalsIgnoreCase("chrome")) {
			System.out.println("Internetovy prehliadac je " + prehliadac);
		}
		
		String meno = "Marian";
		String priezvisko = "Matejov";
		String SSN = "984162168";
		
		//length() - dlzka pola
		System.out.println("v SSN je " + SSN.length() + " cislic.");
		
		//substring - vypise znaky z retazca (pozicia, pocet znakov od pozicie)
		System.out.print(meno.substring(0, 1));
		System.out.print(priezvisko.substring(0, 3));
		// bez urcenia poctu znakov vypise cislice od 5tej pozicii po koniec
		System.out.println(SSN.substring(5));
	}
}
