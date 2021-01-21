package basics;

public class Cities {

	public static void main(String[] args) {
		/*
		//deklarovanie a definovanie pola
		String[] mesta = {"bratislava", "kosice", "banska bystrica"};
		System.out.println(mesta[0]);
		System.out.println(mesta[1]);
		System.out.println(mesta[2]);
	
		
		//pretecenie pola
		String[] staty = new String [2];
		staty[0] = "slovensko";
		staty[1] = "cesko";
		staty[2] = "rakusko";
		System.out.println(staty[0]);
		*/
		
		//deklarovanie velkosti pola
		String[] kraje = new String [5];
		kraje[0] = "bratislavsky";
		kraje[1] = "nitriansky";
		kraje[2] = "kosicky";
		kraje[3] = "banskobystricky";
		kraje[4] = "zvolensky";
		//System.out.println(kraje[0]);
		
		//cykly
		
		// do while cyklus
		
		/*
		int i = 0;
		do {
			System.out.println("kraje: " + kraje[i]);
			i = i + 1;
		} while (i < 5);
		*/
		
		/*
		int j = 0;
		boolean vybratyKraj = false;
		
		while (!vybratyKraj) {
			String kraj = kraje[j];
			System.out.println(kraj);
			if (kraj == "kosicky") {
				System.out.println("stat najdeny");
				vybratyKraj = true;
			}
			j++;
		}
		*/
		
		//for cyklus
		for (int i = 0; i < 5; i++) {
			System.out.println(kraje[i]);
		}
		
	}
}
