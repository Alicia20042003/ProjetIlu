package Test;

import Package.Client;
import Package.Comptage;

public class Histoire {

	public static void main(String[] args) {
		float prixPayee = 0.0f;
		Client alicia = new Client("USABIAGA", "Alicia", "alicia@gmail.com", "12", true, "MapieNiature");
		Comptage compte = new Comptage();
		
		prixPayee += alicia.passerCommande("MapieNiature", "", 5);
		
		System.out.println();
		prixPayee += alicia.passerCommande("MapieNiature", "MAPIE09", 10);
		
		System.out.println();
		compte.releverFinMois(100.0f, prixPayee);
	}
}
