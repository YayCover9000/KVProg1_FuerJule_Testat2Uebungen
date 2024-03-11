package GPSEntfernungen;

//Formel: Entfernungsberechnung
//
//Entfernung = Laufzeit * Lichtgeschwindigkeit 
//
//Lichtgeschwindigkeit in m/s: 299792458 

public class GPSEntfernungen {
 	
//Berechnung der Entfernungen aufgrund der zufälligen Laufzeiten in Kilometern mit Nachkommastellen (siehe Formel).
//Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.
	public static void berechneEntfernungen(int laufzeiten[], double entfernungen[]) {
		int lichtgeschwindigkeit = 299792458;
		if (laufzeiten != null && entfernungen != null) {
  		for (int i = 0; i < laufzeiten.length; i++) {
              // Laufzeit in Sekunden umwandeln (Millisekunden / 1000)
  			System.out.println("L"+laufzeiten[i]);
              double laufzeitInSeconds = laufzeiten[i] / 100.0;
              System.out.println("LS"+laufzeitInSeconds);
              // Entfernung berechnen (Laufzeit * Lichtgeschwindigkeit)
              entfernungen[i] = (laufzeitInSeconds * lichtgeschwindigkeit)*1000;
          
  		}
  		ausgeben(laufzeiten);
  		ausgeben(entfernungen);
		}
	}
	
	
	     	
//Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die Entfernungen wieder auf der Konsole aus.
//Entfernung: Z km
	public static void ausgeben(double entfernungen[]) {
		if(entfernungen != null) {
			for(double e: entfernungen) {
				System.out.println("Entfernung: " + e + " km");
			}
		}
	}
	public static void ausgeben(int laufzeiten[]) {
		if(laufzeiten != null) {
			for(double e: laufzeiten) {
				System.out.println("Laufzeiten: " + e);
			}
		}
	}
}

