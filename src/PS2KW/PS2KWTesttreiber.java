package PS2KW;
import java.util.Scanner;
public class PS2KWTesttreiber {
/*  	1. Lesen Sie n für die Anzahl der PS-Werte ein.

2. Initialisieren Sie ein Array mit n zufälligen PS-Werten größer 0 PS und kleiner 500 PS.
Nutzen Sie hierbei den Zufallszahlengenerator der Klasse Math
.

3. Rufen Sie die folgenden Methoden der Klasse  PS2KW  auf.*/
	public static void main(String [] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ps = new int[n];
		
		for(int i = 0; i < ps.length;i++) {
			do {
				ps[i] =  (int) (Math.random()*500);
			}while (ps[i] > 500 && ps[i] < 0);
		}
//		for(int e : ps) {
//			System.out.println("PS: " + e);
//		}
		PS2KW.berechnePS2KW(ps, null);
	}
}
