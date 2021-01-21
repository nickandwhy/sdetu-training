package oop;

public class Demo {

	public static void main(String[] args) {
		//vytvorenie objektu
		Osoba osoba1 = new Osoba();
		//definovanie vlastnosti objektu
		osoba1.meno = "Marian";
		osoba1.jedlo = "salat";
		
		//abstrakcia
		osoba1.walk();
		osoba1.eat();
		
		Osoba osoba2 = new Osoba();
		osoba2.meno = "Julia";
		
		osoba2.sleep();
	}
}

class Osoba {
	String meno;
	String jedlo;
	
	void walk() {
		System.out.println(meno + " chodi");
	}
	
	void eat() {
		System.out.println(jedlo + " je jeho oblubene jedlo");
	}
	
	void sleep() {
		System.out.println(meno + " prave spi");
	}
}
