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
		double[] dArray = new double[ps.length];
		double[] kw = new double[ps.length];
		
		for(int i = 0; i < ps.length;i++) {
			dArray[i]= 1 +  (Math.random() * 499); 
			ps[i] = (int) dArray[i];
		}
//		for(int e : ps) {
//			System.out.println("PS: " + e);
//		}
		PS2KW.berechnePS2KW(ps, kw);
		PS2KW.ausgeben(kw);
	}
}
