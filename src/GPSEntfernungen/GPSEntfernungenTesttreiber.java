package GPSEntfernungen;
//1. Lesen Sie n für die Anzahl der Laufzeiten/Entfernungen ein.
//
//2. Initialisieren Sie ein Array mit n zufälligen Laufzeiten größer 80 Millisekunden.
//Nutzen Sie hierbei den Zufallszahlengenerator der Klasse Math.
//
//3. Rufen Sie die folgenden Methoden der Klasse GPSEntfernungen auf. 
import java.util.Scanner;
public class GPSEntfernungenTesttreiber {
//	public static int [] laufzeiten = null;
//	public static double[] entfernungen = null;

	public GPSEntfernungenTesttreiber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] laufzeiten = new int[n];
		double[] entfernungen = new double[n];
//		laufzeiten = new int[n];
//		entfernungen = new double[n];
		int laufzeit;
		
		for (int i = 0; i < laufzeiten.length; i++) {
            laufzeit = (int) (Math.random() * 1000)+81;
            if(laufzeit<81) {
            	laufzeit=500;
            }
            laufzeiten[i] = laufzeit;              
        }
      GPSEntfernungen.berechneEntfernungen(laufzeiten, entfernungen);
      GPSEntfernungen.ausgeben(entfernungen);
	}
	public static void main(String [] args) {
      GPSEntfernungenTesttreiber Blobfisch= new GPSEntfernungenTesttreiber(); 
        
		}
	
}
