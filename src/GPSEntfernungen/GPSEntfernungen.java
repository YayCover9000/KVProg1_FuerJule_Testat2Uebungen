package GPSEntfernungen;
public class GPSEntfernungen {
	public static void berechneEntfernungen(int laufzeiten[], double entfernungen[]) {
		int lichtgeschwindigkeit = 299792458;
		
		if (laufzeiten != null && entfernungen != null) {
			for (int i = 0; i < laufzeiten.length; i++) {
			    double zeiten=(double) laufzeiten[i]/1000000.0;
				entfernungen[i]= (zeiten* lichtgeschwindigkeit);
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
					long xy= (long) e;
					System.out.println("Entfernung: " + xy + " km");
				}
			}
	    }
	}
}