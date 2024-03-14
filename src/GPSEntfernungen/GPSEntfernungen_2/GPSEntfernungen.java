package GPSEntfernungen.GPSEntfernungen_2;

public class GPSEntfernungen {
	public static void berechneEntfernungen(int laufzeiten[], double entfernungen[]) {
		int lichtgeschwindigkeit = 299792458;
		double lichtgeschwindigkeitD = (lichtgeschwindigkeit);
		double laufzeiten1;
		for(int e: laufzeiten) {
			System.out.println("Laufzeiten: " + e);
		}
		for (int i = 0; i < laufzeiten.length; i++) {
	            entfernungen[i] = laufzeiten[i] * GPSEntfernungenTesttreiber.LICHTGESCHWINDIGKEIT_MS / 1000.0; // Umrechnung von Millisekunden in Sekunden
		}
	}
	public static void ausgeben(double entfernungen[]) {
		if(entfernungen != null) {
			for(double e: entfernungen) {
				System.out.println("Entfernung: "+e+" km");
			}
		}
	}

}
