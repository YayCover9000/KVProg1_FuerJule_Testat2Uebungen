/* 
1. Initialisieren Sie ein zweidimensionales Array mit n Zeilen und n Spalten, wobei Sie n einlesen, zufällig mit Nullen und Einsen.
Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math

2. Rufen Sie die folgende Methode der Klasse BinaerArrayI auf. 
*/
package Binaer2Dim;

import java.util.Arrays;
import java.util.Scanner;
public class BinaerArrayITesttreiber {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eingabe");
		int n = sc.nextInt();
		int [][] array = new int[n][n];
		int[] countZeroes = new int[array.length];
        int[] countOnes = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] =  (int) Math.round(Math.random());
				if (array[i][j] == 0) {
                    countZeroes[i]++;
                } else {
                    countOnes[i]++;
                }
			}
		}
//		// Ausgabe des Arrays
//	    for (int i = 0; i < array.length; i++) {
//	        System.out.println(Arrays.toString(array[i]) + " - Zeroes: " + countZeroes[i] + ", Ones: " + countOnes[i]);
//	    }
//	    for(int[] e:array) {
//	    	for(int k:e) {
//	    		System.out.print(k);
//	    	}
//	    	System.out.println();
//	    }
	BinaerArrayI.ausgeben(array);
	
}



}
