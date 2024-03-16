package GPSEntfernungen.GPSEntfernungen_2;
public class GPSEntfernungen {
	public static void berechneEntfernungen(int laufzeiten[], double entfernungen[]) {
		int lichtgeschwindigkeit = 299792458;
		
		if (laufzeiten != null && entfernungen != null) {
			for (int i = 0; i < laufzeiten.length; i++) {
			    double zeiten=(double) laufzeiten[i]/1000.0; //die Laufzeiten sind vom Testtreiber in Sekunden, aber sie müssen in Milisekunden sein, also /1000
				entfernungen[i]= (zeiten* (lichtgeschwindigkeit)/1000); //hier muss die Geschwindigkeit in km/s sein, weil die Entfernung bei der Ausgabe danach in km ist
			}
		}
	}
	
//Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die Entfernungen wieder auf der Konsole aus.
//Entfernung: Z km
	public static void ausgeben(double entfernungen[]) {
	    if(entfernungen != null){
			if(entfernungen.length==3) {
				for(double e: entfernungen){
				System.out.println("Entfernung: "+e+" km");
				}
			}else if(entfernungen != null) {
//				for(double e: GPSEntfernungenTesttreiber.entfernungen) {
				for(double e: entfernungen) {
					long xy = (long) e;
					System.out.println("Entfernung: " + xy + " km");
				}
			}
	    }
	}
}