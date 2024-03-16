package GPSEntfernungen.GPSEntfernungen_2;

import java.util.Scanner;
public class GPSEntfernungenTesttreiber {
//	public static int [] laufzeiten = null;
//	public static double[] entfernungen = null;


public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] laufzeiten = new int[n];
		double[] entfernungen = new double[n];
//		laufzeiten = new int[n];
//		entfernungen = new double[n];

		int laufzeit;
		
		/**
		 (int) (Math.random() * 1000): Dieser Teil generiert mit Math.random() einen zufälligen Double-Wert zwischen 0 (einschließlich) und 1000 (exklusiv).
		 Durch Multiplizieren dieses Werts mit 1000 ergibt sich ein Bereich von 0 bis 999,99999 (exklusiv). Durch die Umwandlung in eine Ganzzahl wird der
		 Dezimalteil abgeschnitten, sodass Sie effektiv eine zufällige Ganzzahl zwischen 0 und 999 erhalten.
		 + 81: Dieser Teil addiert 81 zum generierten zufälligen Ganzzahlwert. Durch diese Verschiebung wird sichergestellt, dass das Endergebnis zwischen 81 und 1080 liegt.
		 laufzeit = (int) (Math.random() * 1000) + 81;: Dies weist den generierten zufälligen ganzzahligen Wert der Variablen laufzeit zu.
		 */
		 
		for (int i = 0; i < laufzeiten.length; i++) {
            laufzeit = (int) (80+ Math.random() * Double.MAX_VALUE);
            if(laufzeit <= 80) {
            	laufzeit=81;
            }
            laufzeiten[i] = laufzeit;              
        }
        
      GPSEntfernungen.berechneEntfernungen(laufzeiten, entfernungen);
      GPSEntfernungen.ausgeben(entfernungen);
  

}
		
}