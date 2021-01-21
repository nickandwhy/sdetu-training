package basics;

public class Weather {
	public static void main(String[] args) {
		
		int teplota = 65;
		String stavPocasia = "slnecno";
		
		if (teplota > 80) {
			System.out.println("Vonku je pekne. Oblec si kratke nohavice a tricko");
		}
		else if ((teplota > 60) && (stavPocasia == "slnecno")) {
			System.out.println("Vonku je trochu chladno. Mal by si si pravdepodobne obliect tricko s dlhymi rukavmi a rifle.");
		}
		else if (teplota > 50 || stavPocasia == "zatiahnute") {
			System.out.println("Vonku je chladno. Oblec si teple saty");
		}
		else {
			System.out.println("Vonku je naozaj zima mal by si ostat doma");
		}
		System.out.println("Koniec programu");
		
	}
}
