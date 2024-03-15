package LottozahlenSortieren;
import java.util.Arrays;
public class LottozahlenSortieren {
	
	/*Sortieren Sie die ganzen Zahlen, wobei Sie den Sortieralgorithmus der Klasse Arrays einsetzen können
 oder einen eigenen Sortieralgorithmus schreiben (letzteres ist schwieriger!)*/
	
	public static void sortieren(int lottozahlen[])  {
		if(lottozahlen != null) {
			Arrays.sort(lottozahlen);
		}
	}
	/*1. Initialisieren Sie ein Array für 6 ganze, zufällige Zahlen im Wertebereich von 1 bis 49 (einschließlich) (Zahlen dürfen mehrfach vorkommen).
	Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math

	2. Rufen Sie die folgenden Methoden auf. */
	
	/* Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die Lottozahlen wieder auf der Konsole aus.
*/
	public static void ausgeben(int lottozahlen[]) {
		if(lottozahlen != null) {
			for(int e: lottozahlen) {
				System.out.println(e);
			}
		}
	}
	public static void main(String [] args) {
		int[] lottozahlen = new int[6];
		double zwischen;
		for(int i = 0; i < lottozahlen.length; i++) {
			zwischen = Math.random() * 48.0 + 1.0;
			lottozahlen[i] = (int) zwischen;
		}
		sortieren(lottozahlen);
		ausgeben(lottozahlen);
	}
}
