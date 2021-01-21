package basics;

public class Days {
	public static void main(String[] args) {
		String denVTyzdni = "utorok";
		
		switch (denVTyzdni) {
			case "pondelok": System.out.println("Dnes je pondelok!"); break;
			case "utorok": System.out.println("Dnes je utorok!"); break;
			case "streda": System.out.println("Dnes je streda!"); break;
			case "stvrtok": System.out.println("Dnes je stvrtok!"); break;
			case "piatok": System.out.println("Dnes je piatok!"); break;
			case "sobota": System.out.println("Dnes je sobota!"); break;
			case "nedela": System.out.println("Dnes je nedela!"); break;
		}
	}
}
