package GPSEntfernungen;
//1. Lesen Sie n für die Anzahl der Laufzeiten/Entfernungen ein.
//
//2. Initialisieren Sie ein Array mit n zufälligen Laufzeiten größer 80 Millisekunden.
//Nutzen Sie hierbei den Zufallszahlengenerator der Klasse Math.
//
//3. Rufen Sie die folgenden Methoden der Klasse GPSEntfernungen auf. 
import java.util.Scanner;
public class GPSEntfernungenTesttreiber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int [] laufzeiten = null;
		double [] entfernungen = null;
		int n = sc.nextInt();
		
		if (n != 0) {
          sc.close();
          laufzeiten = new int[n];
          entfernungen = new double[n];

          for (int i = 0; i < laufzeiten.length; i++) {
              int laufzeit;
                  laufzeit = (int) (Math.random() * 1000) + 81;
              laufzeiten[i] = laufzeit;
          }
//			for(int e: laufzeiten) {
//				System.out.println(e);
//			}
//			System.out.println("*_*");
		}
		GPSEntfernungen.berechneEntfernungen(laufzeiten, entfernungen);
	}
}
